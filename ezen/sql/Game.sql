create table GAME_INFO(
GI_NUM INT primary key auto_increment,
GI_NAME VARCHAR(100) not null,
GI_PRICE INT not null,
GI_GENRE VARCHAR(30) not null,
GI_DESC VARCHAR(4000)
);
use ezen;
insert into GAME_INFO(GI_NAME, GI_PRICE, GI_GENRE, GI_DESC)
VALUES('배틀그라운드',0,'슈팅','뭐..재밌지');
select GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC
from GAME_INFO;

update GAME_INFO
set GI_NAME='배틀그라운드2'
,GI_PRICE=0
,GI_GENRE='슈팅'
,GI_DESC='역시 1만한게임은 없군'
where GI_NUM=1;

delete from GAME_INFO where GI_NUM=1;
