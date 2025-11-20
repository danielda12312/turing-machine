public class UnaryAdditionTM {
    private char[] tape;
    private int head;
    private String state = "q0";

    public UnaryAdditionTM(String input)
    {
        this.tape = (input + "_").toCharArray();
    }

    public void run()
    {
        while(!state.equals("HALT"))
        {
            char symbol = tape[head];

            switch (state)
            {
                case "q0":
                    if(symbol == '0')
                    {
                        head++;
                    } else if (symbol == '1')
                    {
                        tape[head] = '_';
                        head++;
                        state = "q1";
                    } else {
                        state = "HALT";
                    }
                    break;
                case "q1":
                    if(symbol == '0')
                    {
                        head++;
                    } else if (symbol == '_') {
                        state = "HALT";
                    } else {
                        head++;
                    }
                    break;

                default:
                    state = "HALT";
            }
        }
    }

    public int getResult()
    {
        String result = new String(tape).replace("_","");
        int sum = result.length();
        return sum;
    }

}
