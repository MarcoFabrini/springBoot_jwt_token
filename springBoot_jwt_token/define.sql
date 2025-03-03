
    create table users (
        active bit not null,
        id integer not null,
        created_at datetime(6),
        updated_at datetime(6),
        email varchar(100) not null,
        full_name varchar(255) not null,
        password varchar(255) not null,
        roles enum ('ROLE_ADMIN','ROLE_MODERATOR','ROLE_USER') not null,
        primary key (id)
    ) engine=InnoDB;

    create table users_seq (
        next_val bigint
    ) engine=InnoDB;

    insert into users_seq values ( 1 );

    alter table users 
       add constraint UK6dotkott2kjsp8vw4d0m25fb7 unique (email);
