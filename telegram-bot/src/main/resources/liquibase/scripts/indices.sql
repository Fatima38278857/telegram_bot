-- liquibase formatted sql

-- changeset fatima:1
CREATE TABLE notification_task
(
id  bigint PRIMARY KEY,
chat_id bigint,
content_notification varchar,
date_time_notification timestamp
);