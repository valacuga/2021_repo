public class God {
    public static Human[] create(){


        Human [] arr = {new Man(), new Woman()};
        return arr;

    }
}

class Human {

}


class Man extends Human {

    Man man = new Man();

}


class Woman extends Human {

    Woman woman = new Woman();

}
