package Drinks;

public class Green_Tea  {
    public String name= "Green_Tea";
    public int cost =5;
    public int milk=3;
    public int sugar=1;
    public int water=2;
    public double full_price(int num_milk,int num_sugar,int num_water){
        int full_price=num_milk*milk+num_sugar*sugar+num_water*water+cost;
        if(num_milk==0 && num_sugar==0 && num_water==0) {//---
            System.out.println("Ваш напиток: " + name + ", его цена " + full_price+"грн.");
        }else if(num_milk>0 && num_sugar==0 && num_water==0) {//+--
            System.out.println("Ваш напиток: " + name + " с "+num_milk+"x молока, его цена " + full_price+"грн.");
        }else if(num_milk>0 && num_sugar>0 && num_water==0) {//++-
            System.out.println("Ваш напиток: " + name + " с "+num_milk+"x молока, и "+num_sugar+"x сахара, его цена" + full_price+"грн.");
        }else if(num_milk>0 && num_sugar>0 && num_water>0) {//+++
            System.out.println("Ваш напиток: " + name + " с "+num_milk+"x молока, "+num_sugar+"x сахара, и "+num_water+"x объемом воды, его цена " + full_price+"грн.");
        }else if(num_milk==0 && num_sugar>0 && num_water==0) {//-+-
            System.out.println("Ваш напиток: " + name + " с "+num_sugar+" кусочками сахара, его цена " + full_price + "грн.");
        }else if(num_milk==0 && num_sugar>0 && num_water>0) {//-++
            System.out.println("Ваш напиток: " + name + " с "+num_sugar+" кусочками сахара и "+num_water+"x объемом воды, его цена " + full_price + "грн.");
        }else if(num_milk>0 && num_sugar==0 && num_water>0) {//+-+
            System.out.println("Ваш напиток: " + name + " с "+num_milk+"x молока и "+num_water+"x объемом воды, его цена " + full_price + "грн.");
        }else if(num_milk==0 && num_sugar==0 && num_water>0) {//--+
            System.out.println("Ваш напиток: " + name + " с " + num_water+"x объемом воды, его цена " + full_price + "грн.");
        }
        return  full_price;
    }
}
