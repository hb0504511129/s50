-- Table: tm_pkg

-- DROP TABLE tm_pkg;

CREATE TABLE tm_pkg
(
  name character varying(100) NOT NULL,
  num numeric(10,0),
  rate numeric(20,10),
  CONSTRAINT tm_pkg_pkey PRIMARY KEY (name)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tm_pkg
  OWNER TO postgres;
COMMENT ON TABLE tm_pkg
  IS '红包后端数据';
