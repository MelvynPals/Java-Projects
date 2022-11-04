public class Secret{
   private String name;
   private int age;
   private int weight;
   private double height;

   public Secret(){}
   
   public Secret(String name, int age, int weight, double height) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
   }

   public void print() {
      System.out.println("\nname: " + name + "\nage: " + age +
                        "\nweight: " + weight + "kg" + "\nheight: " +
                        height + "m");
   }
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public int getWeight() {
      return weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }

   public double getHeight() {
      return height;
   }

   public void setHeight(double height) {
      this.height = height;
   }
}