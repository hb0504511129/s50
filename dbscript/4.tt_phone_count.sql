-- Table: tt_phone_count

-- DROP TABLE tt_phone_count;

CREATE TABLE tt_phone_count
(
  phone character varying(20) NOT NULL,
  dt date NOT NULL,
  ct numeric(2,0),
  CONSTRAINT tt_phone_count_pkey PRIMARY KEY (phone, dt)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tt_phone_count
  OWNER TO postgres;
COMMENT ON TABLE tt_phone_count
  IS '电话抽奖次数';
