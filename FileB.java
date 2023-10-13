//second commit to offshoot
                System.out.println("£" + pounds + " will give you " + euro + "€");
                break;
            case 2:
                System.out.print("How many euro would you like to convert? ");
                euro   = scan.nextDouble();
                pounds = euro * poundOverEuroRatio;
                System.out.println(euro + "€ will give you £" + pounds);
                break;
            case 0:
                finished = true;
                break;
            default:
                System.out.println("Sorry, that is not a valid option");
            }
        }
        System.out.println("Exiting the program");
    }
}


//mergerrrrr