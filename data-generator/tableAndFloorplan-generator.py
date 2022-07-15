def floorplan1(res_id):
    print("""insert into RESTAURANT_FLOOR_PLAN(ID, HEIGHT, WIDTH, IMAGE_ID, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b5185{id}', 600 * 2, 1000 * 2, '069f72db-2157-43de-8e88-21661b518200',
        '069f72db-2157-43de-8e88-21661b5185{id}');

insert into TABLE_FLOOR_PLAN(ID, HEIGHT, WIDTH, X, Y, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b5185{id}', 100 * 2, 100 * 2, 725 * 2, 40 * 2,
        '069f72db-2157-43de-8e88-21661b518241');
insert into TABLE_FLOOR_PLAN(ID, HEIGHT, WIDTH, X, Y, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b5186{id}', 150 * 2, 200 * 2, 75 * 2, 55 * 2,
        '069f72db-2157-43de-8e88-21661b518282');
insert into TABLE_FLOOR_PLAN(ID, HEIGHT, WIDTH, X, Y, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b5187{id}', 125 * 2, 260 * 2, 550 * 2, 270 * 2,
        '069f72db-2157-43de-8e88-21661b518212');
insert into TABLE_FLOOR_PLAN(ID, HEIGHT, WIDTH, X, Y, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b5188{id}', 130 * 2, 165 * 2, 60 * 2, 275 * 2,
        '069f72db-2157-43de-8e88-21661b518284');    
insert into TABLE_FLOOR_PLAN(ID, HEIGHT, WIDTH, X, Y, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b5189{id}', 100 * 2, 100 * 2, 95 * 2, 465 * 2,
        '069f72db-2157-43de-8e88-21661b518242');

insert into restaurant_table(id, seats, restaurant_id, FLOOR_PLAN_ID)
values ('069f72db-2157-43de-8e88-21661b5185{id}', 3, '069f72db-2157-43de-8e88-21661b5185{id}',
        '069f72db-2157-43de-8e88-21661b5185{id}');
insert into restaurant_table(id, seats, restaurant_id, FLOOR_PLAN_ID)
values ('069f72db-2157-43de-8e88-21661b5186{id}', 3, '069f72db-2157-43de-8e88-21661b5185{id}',
        '069f72db-2157-43de-8e88-21661b5186{id}');
insert into restaurant_table(id, seats, restaurant_id, FLOOR_PLAN_ID)
values ('069f72db-2157-43de-8e88-21661b5187{id}', 3, '069f72db-2157-43de-8e88-21661b5185{id}',
        '069f72db-2157-43de-8e88-21661b5187{id}');
insert into restaurant_table(id, seats, restaurant_id, FLOOR_PLAN_ID)
values ('069f72db-2157-43de-8e88-21661b5188{id}', 3, '069f72db-2157-43de-8e88-21661b5185{id}',
        '069f72db-2157-43de-8e88-21661b5188{id}');
insert into restaurant_table(id, seats, restaurant_id, FLOOR_PLAN_ID)
values ('069f72db-2157-43de-8e88-21661b5189{id}', 3, '069f72db-2157-43de-8e88-21661b5185{id}',
        '069f72db-2157-43de-8e88-21661b5189{id}');""".format(id=str(res_id).zfill(2)))


def floorplan2(res_id):
    print("""insert into RESTAURANT_FLOOR_PLAN(ID, HEIGHT, WIDTH, IMAGE_ID, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b5185{id}', 600 * 2, 1000 * 2, '069f72db-2157-43de-8e88-21661b518200',
        '069f72db-2157-43de-8e88-21661b5185{id}');

insert into TABLE_FLOOR_PLAN(ID, HEIGHT, WIDTH, X, Y, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b5185{id}', 260 * 2, 125 * 2, 700 * 2, 25 * 2,
        '069f72db-2157-43de-8e88-21661b518211');
insert into TABLE_FLOOR_PLAN(ID, HEIGHT, WIDTH, X, Y, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b5186{id}', 150 * 2, 200 * 2, 75 * 2, 55 * 2,
        '069f72db-2157-43de-8e88-21661b518282');
insert into TABLE_FLOOR_PLAN(ID, HEIGHT, WIDTH, X, Y, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b5187{id}', 100 * 2, 100 * 2, 95 * 2, 285 * 2,
        '069f72db-2157-43de-8e88-21661b518242');
insert into TABLE_FLOOR_PLAN(ID, HEIGHT, WIDTH, X, Y, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b5188{id}', 130 * 2, 165 * 2, 75 * 2, 450 * 2,
        '069f72db-2157-43de-8e88-21661b518282');
        
insert into restaurant_table(id, seats, restaurant_id, FLOOR_PLAN_ID)
values ('069f72db-2157-43de-8e88-21661b5185{id}', 3, '069f72db-2157-43de-8e88-21661b5185{id}',
        '069f72db-2157-43de-8e88-21661b5185{id}');
insert into restaurant_table(id, seats, restaurant_id, FLOOR_PLAN_ID)
values ('069f72db-2157-43de-8e88-21661b5186{id}', 3, '069f72db-2157-43de-8e88-21661b5185{id}',
        '069f72db-2157-43de-8e88-21661b5186{id}');
insert into restaurant_table(id, seats, restaurant_id, FLOOR_PLAN_ID)
values ('069f72db-2157-43de-8e88-21661b5187{id}', 3, '069f72db-2157-43de-8e88-21661b5185{id}',
        '069f72db-2157-43de-8e88-21661b5187{id}');
insert into restaurant_table(id, seats, restaurant_id, FLOOR_PLAN_ID)
values ('069f72db-2157-43de-8e88-21661b5188{id}', 3, '069f72db-2157-43de-8e88-21661b5185{id}',
        '069f72db-2157-43de-8e88-21661b5188{id}');""".format(id=str(res_id).zfill(2)))


if __name__ == '__main__':
    for x in range(1, 97):
        if (x % 2) == 0:
            floorplan1(x)
        else:
            floorplan2(x)
