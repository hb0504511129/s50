-- Table: tt_phone_prize

-- DROP TABLE tt_phone_prize;

CREATE TABLE tt_phone_prize
(
  name character varying(50),
  phone character varying(20) NOT NULL,
  pz character varying(200),
  addr character varying(200),
  CONSTRAINT tt_phone_prize_pkey PRIMARY KEY (phone)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tt_phone_prize
  OWNER TO postgres;
COMMENT ON TABLE tt_phone_prize
  IS '获奖人信息';
