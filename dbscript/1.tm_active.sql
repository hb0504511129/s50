-- Table tm_active

-- DROP TABLE tm_active;

CREATE TABLE tm_active
(
  id numeric(5,0) NOT NULL,
  from_dt date,
  to_dt date,
  status numeric(1,0), -- 1Ϊ��Ч...
  CONSTRAINT tm_active_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tm_active
  OWNER TO postgres;
COMMENT ON TABLE tm_active
  IS '�';
COMMENT ON COLUMN tm_active.status IS '1Ϊ��Ч
0Ϊ��Ч';

