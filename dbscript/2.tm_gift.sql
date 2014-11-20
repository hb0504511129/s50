-- Table: tm_gift

-- DROP TABLE tm_gift;

CREATE TABLE tm_gift
(
  name character varying(100) NOT NULL,
  num numeric(10,0),
  rate numeric(20,10),
  CONSTRAINT tm_pkg_pkey PRIMARY KEY (name)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tm_gift
  OWNER TO postgres;
COMMENT ON TABLE tm_gift
  IS '红包后端数据';
