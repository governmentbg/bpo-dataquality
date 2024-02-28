create table file_epo_transfer
(
    id                    serial                   NOT NULL,
    data_type             varchar(255)             NOT NULL,
    transfer_user         varchar(255)             NOT NULL,
    transfer_date         timestamp with time zone NOT NULL,
    delivery_id           varchar(100) unique      NOT NULL,
    file_name             varchar(500),
    is_partial            boolean,
    partial_date_from     date,
    partial_date_to       date,
    epo_status            text,
    epo_validation_errors text,
    error_message         text,
    CONSTRAINT file_epo_transfer_pk PRIMARY KEY (id)
)