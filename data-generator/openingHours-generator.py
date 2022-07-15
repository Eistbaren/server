from random import randint

if __name__ == '__main__':
    for x in range(1, 97):
        print("""INSERT INTO TIMESLOT
values ('069f72db-2157-43de-8e88-21661b5185{id}', parsedatetime('02-07-2022 {open}:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        parsedatetime('03-07-2022 {close}:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        '069f72db-2157-43de-8e88-21661b5185{id}');""".format(
            open=str(randint(6, 12)).zfill(2), close=randint(13, 21), id=str(x).zfill(2)))
