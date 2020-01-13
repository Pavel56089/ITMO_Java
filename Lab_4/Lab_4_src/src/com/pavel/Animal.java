package com.pavel;
class Animal extends Human {
    private String Type;
    private String Name;
    Animal(String n, String type) {
        super(n);
        Name = n;
        Type = type;
    }

    public void useHeadAndItem(String method, Thing thng){
        System.out.println(Name + method + thng.toString());
    }

    @Override
    public int hashCode() {
        return super.hashCode()+Type.hashCode();
    }

    @Override
    public String toString() {
        return (super.toString() + Type);
    }

    @Override
    public String getName() {
        return (super.getName() + " " + Type);
    }


    public class HeadOfAnimal {
        void appear(){
            System.out.println("Голова животного " + Name + " появилась ");
        }

        public void headAndItem(Thing p, String method){
            System.out.println("Голова" + Name + " " + method + " " + p.getType());
        }
    }

    public static class Description{
        public void getArticle(){
            System.out.println("Живо́тные (лат. Animalia) — традиционно (со времён Аристотеля) выделяемая категория организмов, в настоящее время рассматривается в качестве биологического царства. Животные являются основным объектом изучения зоологии.");
        }
    }

}
