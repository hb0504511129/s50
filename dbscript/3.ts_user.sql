-- Table: ts_user

-- DROP TABLE ts_user;

CREATE TABLE ts_user
(
  id numeric(20,0) NOT NULL,
  name character varying(100),
  status numeric(1,0),
  password character varying(50),
  CONSTRAINT ts_user_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE ts_user
  OWNER TO postgres;
