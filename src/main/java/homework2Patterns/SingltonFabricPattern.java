package homework2Patterns;

public class SingltonFabricPattern {
    private static Figure toReturn;

    private SingltonFabricPattern() {
    }


    public static Figure getFigure(String fig) {

        switch (fig) {
            case "rectangular":
                toReturn = new Rectangular.Builder()
                            .withHeight(34)
                            .withSquare(new Square()) /*Можно так делать?*/
                            .build();
                break;

            case "square":
                toReturn = new Square.Builder()
                        .withLength(34.3)
                        .withLowerLeftCorn(new Point(1,2))
                        .build();
                break;

            case "oval":
                toReturn = new Oval();   /*А так?  Классы Овала и Круга не имеют вложенного конструктора, внутренний класс
                Билдер не статический с публичным конструктором*/
                break;
            case "cicle":
                toReturn = new Cicle();
                break;

            default:
                throw new IllegalArgumentException("No such figure");
        }

        return toReturn;
    }
}
