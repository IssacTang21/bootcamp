
-- SQL EXE4
create table players (
    player_id integer not null unique, 
    group_id integer not null
);

create table matches (
    match_id integer not null unique, 
    first_player integer not null, 
    second_player integer not null, 
    first_score integer not null, 
    second_score integer not null
);

select * from players;
select * from matches;

delete from players;
delete from matches;
insert into players values (20, 2);
insert into players values (30, 1);
insert into players values (40, 3);
insert into players values (45, 1);
insert into players values (50, 2);
insert into players values (65, 1);
insert into matches values (1, 30, 45, 10, 12);
insert into matches values (2, 20, 50, 5, 5);
insert into matches values (13, 65, 45, 10, 10);
insert into matches values (5, 30, 65, 3, 15);
insert into matches values (42, 45, 65, 8, 4);

with player_total_score as (
select p.player_id, sum(first_score) as total_score from players p join matches m
on p.player_id = m.first_player group by p.player_id
union
select p.player_id, sum(second_score) as total_score from players p join matches m
on p.player_id = m.second_player group by p.player_id), 
final_score as(
select player_id, sum(total_score) as total_score
from player_total_score group by player_id),
finals as(
select p.group_id, p.player_id, f.total_score, 
row_number() over (partition by p.group_id order by f.total_score desc) as row_num
from players p 
left join final_score f
on p.player_id = f.player_id)
select group_id, player_id as winner_id from finals where row_num = 1;