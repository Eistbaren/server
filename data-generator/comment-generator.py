from random import randint, choice

if __name__ == '__main__':
    dish_list = ['fish', 'taco', 'steak', 'pasta', 'chicken', 'fillet', 'meat', 'wrap', 'salmon', 'pizza', 'burger',
                 'lasagna', 'spareribs', 'duck', 'ramen', 'garlic pie']
    food_rating_list = ['disgusting!', 'poor.', 'okay.',
                        'great.', 'stunning!']
    service_rating_list = ['I never eat there again.', 'The service was okay.', 'okay.',
                           'Would visit again.', 'Kitchen chef and team were very friendly.']
    name_list = ['Fritz', 'Dieter', 'Emma', 'Luis', 'Carl', 'Goerge', 'Leo', 'Oscar', 'Harry', 'Jack', 'Freddie',
                 ' Mia', 'Sophia', 'Lilly', 'Charlotte', 'Alice']

    for x in range(1, 97):
        rating = randint(1, 5)
        if rating < 3:
            rating = randint(1, 5)
        service = min(max(rating + randint(-1, 2), 1), 5)
        print("""insert into comment(rating, comment, name, RESTAURANT_ID)
        values({rating}, '{comment}', '{name}', '069f72db-2157-43de-8e88-21661b5185{id}');""".format(
            rating=rating,
            comment="The {dish} was {rating} {service}".format(dish=choice(dish_list),
                                                               rating=food_rating_list[rating - 1],
                                                               service=service_rating_list[service - 1]),
            name=choice(name_list),
            id=str(x).zfill(2)))
        rating = min(max(rating + randint(-1, 2), 1), 5)
        service = min(max(rating + randint(-1, 1), 1), 5)

        print("""insert into comment(rating, comment, name, RESTAURANT_ID)
        values({rating}, '{comment}', '{name}', '069f72db-2157-43de-8e88-21661b5185{id}');""".format(
            rating=rating,
            comment="The {dish} was {rating} {service}".format(dish=choice(dish_list),
                                                               rating=food_rating_list[rating - 1],
                                                               service=service_rating_list[service - 1]),
            name=choice(name_list),
            id=str(x).zfill(2)))
        rating = min(max(rating + randint(-1, 2), 1), 5)
        service = min(max(rating + randint(-1, 2), 1), 5)

        print("""insert into comment(rating, comment, name, RESTAURANT_ID)
                values({rating}, '{comment}', '{name}', '069f72db-2157-43de-8e88-21661b5185{id}');""".format(
            rating=rating,
            comment="The {dish} was {rating} {service}".format(dish=choice(dish_list),
                                                               rating=food_rating_list[rating - 1],
                                                               service=service_rating_list[service - 1]),
            name=choice(name_list),
            id=str(x).zfill(2)))
        rating = min(max(rating + randint(-1, 2), 1), 5)
        service = min(max(rating + randint(-1, 2), 1), 5)

        print("""insert into comment(rating, comment, name, RESTAURANT_ID)
                values({rating}, '{comment}', '{name}', '069f72db-2157-43de-8e88-21661b5185{id}');""".format(
            rating=rating,
            comment="The {dish} was {rating} {service}".format(dish=choice(dish_list),
                                                               rating=food_rating_list[rating - 1],
                                                               service=service_rating_list[service - 1]),
            name=choice(name_list),
            id=str(x).zfill(2)))
