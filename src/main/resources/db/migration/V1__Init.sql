CREATE TABLE Client
(
    id       int         NOT NULL PRIMARY KEY,
    FIO      varchar(90) NOT NULL,
    gender   char(1)     NOT NULL CHECK (gender IN ('м', 'ж')) DEFAULT 'м',
    height   int CHECK (height > 0),
    weight   int CHECK (weight > 0),
    param    varchar(10),
    fat      int,
    muscles  int,
    water    int,
    tel      int         NOT NULL UNIQUE,
    passport int         NOT NULL UNIQUE
);

CREATE TABLE Coach
(
    FIO       varchar(90) NOT NULL PRIMARY KEY,
    gender    char(1)     NOT NULL CHECK (gender IN ('м', 'ж')) DEFAULT 'м',
    exp       int CHECK (exp >= 0),
    education varchar(100),
    achieve   varchar(100),
    rating    int         NOT NULL CHECK (rating > 0 AND rating <= 5),
    tel       int         NOT NULL UNIQUE,
    salary    int         NOT NULL CHECK (salary > 0),
    passport  int         NOT NULL UNIQUE,
    adress    varchar(50) NOT NULL
);

CREATE TABLE Workout
(
    name       varchar(20) NOT NULL PRIMARY KEY,
    type       varchar(15) NOT NULL DEFAULT 'разминка',
    musc_group varchar(50),
    kkal       int,
    level      varchar(15)          DEFAULT 'начальный'
);

CREATE TABLE Training
(
    id              int         NOT NULL PRIMARY KEY,
    type            varchar(15) NOT NULL                          DEFAULT 'разминка',
    time            time        NOT NULL                          DEFAULT '00:30',
    burn_kkal       int CHECK (burn_kkal > 0),
    cost            int         NOT NULL CHECK (cost > 0),
    recomend_gender char(1) CHECK (recomend_gender IN ('м', 'ж')) DEFAULT 'м',
    level           varchar(15)                                   DEFAULT 'начальный'
);

CREATE TABLE TrainingWork
(
    id        int         NOT NULL PRIMARY KEY,
    train_id  int         NOT NULL,
    name      varchar(20) NOT NULL,
    repet     int         NOT NULL DEFAULT 3,
    time_work time        NOT NULL DEFAULT '00:01',
    time_rest time        NOT NULL DEFAULT '00:01',
    FOREIGN KEY (train_id) REFERENCES Training (id),
    FOREIGN KEY (name) REFERENCES Workout (name)
);

CREATE TABLE Register
(
    id          int         NOT NULL PRIMARY KEY,
    date        date        NOT NULL,
    time        time        NOT NULL,
    id_client   int         NOT NULL,
    FIO_coach   varchar(90) NOT NULL,
    id_training int         NOT NULL,
    cost        int         NOT NULL CHECK (cost > 0),
    pay_status  varchar(20) NOT NULL DEFAULT 'не оплачено',
    FOREIGN KEY (id_client) REFERENCES Client (id),
    FOREIGN KEY (FIO_coach) REFERENCES Coach (FIO),
    FOREIGN KEY (id_training) REFERENCES Training (id)
);


