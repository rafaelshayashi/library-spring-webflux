create table if not exists book
(
    id bigserial primary key,
    uuid uuid not null,
    title varchar (255) not null,
    sub_title varchar (255) not null,
    currency varchar (6) not null,
    amount_in_cents integer not null,
    description text,
    isbn varchar not null unique,
    created_at timestamp not null,
    created_by varchar not null,
    updated_at timestamp not null,
    updated_by timestamp not null
)