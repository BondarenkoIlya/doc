CREATE TABLE roles
(
  id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  role VARCHAR(45) NOT NULL
);

CREATE TABLE users
(
  id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  password VARCHAR(60) NOT NULL,
  enabled TINYINT(4) DEFAULT '1' NOT NULL
);

CREATE TABLE user_roles
(
  id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  user_id BIGINT(20) NOT NULL,
  role_id BIGINT(20) NOT NULL,
  CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users (id),
  CONSTRAINT fk_role_id FOREIGN KEY (role_id) REFERENCES roles (id)
);
CREATE INDEX fk_role_idx ON user_roles (role_id);
CREATE INDEX fk_user_idx ON user_roles (user_id);

CREATE TABLE user_info
(
  id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  user_name VARCHAR(150) NOT NULL,
  user_id BIGINT(20),
  CONSTRAINT user_info_users_id_fk FOREIGN KEY (user_id) REFERENCES users (id)
);
CREATE INDEX user_info_users_id_fk ON user_info (user_id);

CREATE TABLE email_address
(
  id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  recipient_email VARCHAR(150) NOT NULL,
  user_info_id BIGINT(20) NOT NULL,
  CONSTRAINT email_address_user_info_id_fk FOREIGN KEY (user_info_id) REFERENCES user_info (id)
);
CREATE INDEX email_address_user_info_id_fk ON email_address (user_info_id);

CREATE TABLE company
(
  id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  company_name VARCHAR(150) NOT NULL,
  user_info_id BIGINT(20) NOT NULL,
  CONSTRAINT company_user_info_id_fk FOREIGN KEY (user_info_id) REFERENCES user_info (id)
);
CREATE INDEX company_user_info_id_fk ON company (user_info_id);

CREATE TABLE agreement
(
  id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  conclusion_date DATETIME NOT NULL,
  expiry_date DATETIME NOT NULL,
  company_id BIGINT(20) NOT NULL,
  CONSTRAINT agreement_company_id_fk FOREIGN KEY (company_id) REFERENCES company (id)
);
CREATE INDEX agreement_company_id_fk ON agreement (company_id);