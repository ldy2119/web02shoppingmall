use web02board;

/*



drop table if exists advertise;
drop table if exists cart;
drop table if exists category;
drop table if exists comment;
drop table if exists product;
drop table if exists user;


create table user(
  id bigint primary key auto_increment,
  account varchar(100) not null unique,
  password varchar(100),
  username varchar(30),
  phoneNumber varchar(30),
  telNumber varchar(30),
  postNumber varchar(30),
  detailAddress varchar(30),
  address varchar(30),
  mileage int,
  email varchar(50) not null unique,
  created datetime default current_timestamp,
  updated datetime default current_timestamp on update current_timestamp
) engine=InnodB default charset=utf8mb4;

create table category(
  id bigint primary key auto_increment,
  categoryName varchar(30)
) engine=InnodB default charset=utf8mb4;

create table product(
  id bigint primary key auto_increment,
  categoryId bigint,
  productName varchar(255),
  imagePath varchar(255),
  companyName varchar(255),
  detailDescription varchar(255),
  eventName varchar(255),
  cost int,
  mileage int,
  sellingCount int,
  created datetime default current_timestamp,
  updated datetime default current_timestamp on update current_timestamp,

  foreign key (categoryId) references category(id)
) engine=InnodB default charset=utf8mb4;

create table cart(
  id bigint primary key auto_increment,
  userId bigint,
  productId bigint,
  productCount int,
  created datetime default current_timestamp,
  updated datetime default current_timestamp on update current_timestamp,

  foreign key (userId) references user(id),
  foreign key (productId) references product(id)
) engine=InnodB default charset=utf8mb4;

create table advertise(
  id bigint primary key auto_increment,
  imagePath varchar(255),
  url varchar(255)
) engine=InnodB default charset=utf8mb4;

create table comment(
  id bigint primary key auto_increment,
  userId bigint,
  commentContent varchar(255),
  productId bigint,
  created datetime default current_timestamp,
  updated datetime default current_timestamp on update current_timestamp,

  foreign key (userId) references user(id),
  foreign key (productId) references product(id)
) engine=InnodB default charset=utf8mb4;
*/
