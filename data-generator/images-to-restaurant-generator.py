from random import uniform

if __name__ == '__main__':

    for x in range(1, 27):
        print("""insert into RESTAURANT_IMAGES (RESTAURANT_ID, IMAGE_ID)
        values ('069f72db-2157-43de-8e88-21661b5185{id}', '069f72db-2157-43de-8e88-21661b5185{id}');""".format(
            id=str(x).zfill(2)));

    for x in range(1, 13):
        print("""insert into RESTAURANT_IMAGES (RESTAURANT_ID, IMAGE_ID)
        values ('069f72db-2157-43de-8e88-21661b5185{id}', '069f72db-2157-43de-8e88-21661b5186{id}');""".format(
                id=str(x).zfill(2)));
