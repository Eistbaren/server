from random import uniform

if __name__ == '__main__':

    backgrounds = [
        'background-0.webp',
        'background-1.webp',
        'background-2.webp',
        'background-3.webp',
        'background-4.webp',
        'background-5.webp',
        'background-6.webp',
        'background-7.webp',
        'background-8.webp',
        'background-9.webp',
        'background-10.webp',
        'background-11.webp',
        'background-12.webp',
        'background-13.webp',
        'background-14.webp',
        'background-15.webp',
        'background-16.webp',
        'background-17.webp',
        'background-18.webp',
        'background-19.webp',
        'background-20.webp',
        'background-21.webp',
        'background-22.webp',
        'background-23.webp',
        'background-24.webp',
        'background-25.webp',
        'background-26.webp', ]

    food_images = [
        'food-0.webp',
        'food-1.webp',
        'food-2.webp',
        'food-3.webp',
        'food-4.webp',
        'food-5.webp',
        'food-6.webp',
        'food-7.webp',
        'food-8.webp',
        'food-9.webp',
        'food-10.webp',
        'food-11.webp',
        'food-12.webp', ]
    for x in range(1, len(backgrounds)):
        print("""insert into IMAGE (ID, IMAGEURL)
        values ('069f72db-2157-43de-8e88-21661b5185{id}', '/serverFile/serverImages/restaurant/{image}');""".format(
            id=str(x).zfill(2), image=backgrounds[x]))

    for x in range(1, len(food_images)):
        print("""insert into IMAGE (ID, IMAGEURL)
        values ('069f72db-2157-43de-8e88-21661b5186{id}', '/serverFile/serverImages/restaurant/{image}');""".format(
            id=str(x).zfill(2), image=food_images[x]))
