from random import uniform

if __name__ == '__main__':
    for x in range(1, 97):
        print("""insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
        values({lat}, {lon}, '069f72db-2157-43de-8e88-21661b5185{id}');""".format(lat=uniform(47.900, 48.600),
                                                                                  lon=uniform(11, 12.0),
                                                                                  id=str(x).zfill(2)))
