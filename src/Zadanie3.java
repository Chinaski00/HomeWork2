public class Zadanie3 {
    public static void main(String[] args) {
      var boxMan1 = 78.2;
      var boxMan2 = 82.7;
        System.out.println("Общий вес двух бойцов " + (boxMan1 + boxMan2) + " кг.");
        System.out.println("Разница между двумя бойцами " + (boxMan2 - boxMan1) + " кг.");

        //Вычислите разницу весов спортсменов, используя 2 способа
        System.out.println("Разница между двумя бойцами первым способом" + (boxMan2 - boxMan1) + " кг.");
        System.out.println("Разница между двумя бойцами через остаток от деления " + ((boxMan2 % boxMan1)) + " кг.");

        //Решите задачу с помощью функций сложения, вычитания, умножения и деления.(первая)
        var vremya = 640;
        var vremyaSotrudnika = 8;
        System.out.println("Всего сотрудников в компании - " + (vremya / vremyaSotrudnika) + " человек.");

        //Вторая
        var person = 80;
        var persons = person + 94; //на 94 человека больше
        System.out.println("Если в компании работает " + persons + " человек, то всего " + (persons * vremyaSotrudnika) + " часов работы может быть поделено между сотрудниками.");
    }
}
