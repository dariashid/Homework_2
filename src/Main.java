public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeightBoxers = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общяя масса двух бойцов " + totalWeightBoxers + " кг.");
        var weightDifferenceBoxers = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница между массами бойцов " + weightDifferenceBoxers + " кг." );


        System.out.println("Задача 7");
        var weightDifferenceBoxers1 = weightSecondBoxer - weightFirstBoxer;
        System.out.println(weightDifferenceBoxers1);
        var weightDifferenceBoxers2 = (weightSecondBoxer - weightFirstBoxer) % totalWeightBoxers;
        System.out.println(weightDifferenceBoxers2);

        System.out.println("Задача 8");
        var workingHours = 640;
        var hoursPerWorker = 8;
        var numberOfWorker = workingHours / hoursPerWorker;
        System.out.println("Всего работников в компании- " +numberOfWorker + " человек");

        numberOfWorker = numberOfWorker + 94;
        var hoursPerWorker1 = workingHours / numberOfWorker;
        System.out.println("Если в компании работает " + numberOfWorker + " человека, то всего " + hoursPerWorker1 + " часа работы может быть поделено между сотрудниками.");

    }

    }