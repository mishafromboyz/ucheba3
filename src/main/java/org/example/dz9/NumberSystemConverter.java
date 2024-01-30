package org.example.dz9;


public class NumberSystemConverter
{
    protected String content;

    public String getContent() {
        return content;
    }

    public void toOct(String value)
    {
        int ir;

        if(value.matches("^0[bB][0-1]+"))
        {
            System.out.println("bin");
            ir = Integer.parseInt(value.substring(2), 2);
        }

        else if (value.matches("^0[xX][[0-9][a-f][A-F]]+"))
        {
            System.out.println("hex");
            ir = Integer.parseInt(value.substring(2), 16);
        }

        else
        {
            System.out.println("dec");
            ir = Integer.parseInt(value);
        }

        this.content = Integer.toOctalString(ir);
    }

    public void toBin(String value)
    {
        int ir;

         if (value.matches("^0[xX][[0-9][a-f][A-F]]+"))
        {
            System.out.println("hex");
            ir = Integer.parseInt(value.substring(2), 16);
        }

        else if (value.startsWith("0"))
        {
            System.out.println("oct");
             ir = Integer.parseInt(value.substring(1), 8);
         }

        else
        {
            System.out.println("dec");
             ir = Integer.parseInt(value);
         }

        this.content = Integer.toBinaryString(ir);
    }

    public void toHex(String value)
    {
        int ir;

        if(value.matches("^0[bB][0-1]+"))
        {
            System.out.println("bin");
            ir = Integer.parseInt(value.substring(2), 2);
        }

        else if (value.startsWith("0"))
        {
            System.out.println("oct");
            ir = Integer.parseInt(value.substring(1), 8);
        }

        else
        {
            System.out.println("dec");
            ir = Integer.parseInt(value);
        }

        this.content = Integer.toHexString(ir);
    }

    public void toDec(String value)
    {
        int res;
        if (value.startsWith("0b"))
            res = Integer.parseInt(value.substring(2), 2);
        else
            res = Integer.decode(value);

        this.content = String.valueOf(res);
    }
}
