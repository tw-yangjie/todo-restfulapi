CREATE TABLE tags(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR (255),
  userid INT ,
  FOREIGN KEY (userid) REFERENCES user(id)
)engine=InnoDB DEFAULT CHARSET=gbk;