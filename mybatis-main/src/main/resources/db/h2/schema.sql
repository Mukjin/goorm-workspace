create table board(
    seq int auto_increment primary key,
    title varchar not null,
    contents varchar not null,
    reg_user varchar not null,
    reg_date Timestamp default CURRENT_TIMESTAMP not null
);

create table board3 (
    seq int(11) not null auto_increment PRIMARY KEY,
    title varchar(40) not null,
    contents text not null,
    reg_user varchar(10) not null,
    reg_date timestamp not null default current_timestamp()
);