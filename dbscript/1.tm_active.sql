-- Table tm_active

-- DROP TABLE tm_active;

CREATE TABLE tm_active
(
  id numeric(5,0) NOT NULL,
  from_dt date,
  to_dt date,
  status numeric(1,0), -- 1为有效...
  CONSTRAINT tm_active_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tm_active
  OWNER TO postgres;
COMMENT ON TABLE tm_active
  IS '活动';
COMMENT ON COLUMN tm_active.status IS '1为有效
0为无效';

