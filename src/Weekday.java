public enum Weekday {
    MONDAY("Дуйшомбу"){
        @Override
        void method() {
            System.out.println(MONDAY.nameWeek);
            System.out.println("В понедельник у нас урок по джвав");
        }
    },
    TUESDAY("Шейшемби"){
        @Override
        void method() {
            System.out.println(TUESDAY.nameWeek);
            System.out.println("Во вторник у нас английский ");
        }
    },
    WEDNESDAY("Шаршемби"){
        @Override
        void method() {
            System.out.println(WEDNESDAY.nameWeek);
            System.out.println("В среду у нас урок по джава");
        }
    },
    THURSDAY("Бейшемби"){
        @Override
        void method() {
            System.out.println(THURSDAY.nameWeek);
            System.out.println("В четверг у нас урок практики");
        }
    },
    FRIDAY("Жума"){
        @Override
        void method() {
            System.out.println(FRIDAY.nameWeek);
            System.out.println("В пятницу у нас урок по джава");
        }
    },
    SATURDAY("Ишемби"){
        @Override
        void method() {
            System.out.println(SATURDAY.nameWeek);
            System.out.println("В субботу у нас урок практики");
        }
    },
    SUNDAY("Жекшемби"){
        @Override
        void method() {
            System.out.println(SUNDAY.nameWeek);
            System.out.println("В воскресенье у нас выходной");
        }
    };
    public String nameWeek;

    Weekday(String nameWeek) {
        this.nameWeek = nameWeek;
    }

    public String getNameWeek() {
        return nameWeek;
    }

    public void setNameWeek(String nameWeek) {
        this.nameWeek = nameWeek;
    }

    abstract void method();

    @Override
    public String toString() {
        return "Weekday{" +
                "nameWeek='" + nameWeek + '\'' +
                '}';
    }
}

