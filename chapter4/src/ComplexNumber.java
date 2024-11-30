public class ComplexNumber {
    double realPart; // 定义属性表示实部
    double imagePart; // 定义属性表示虚部

    public ComplexNumber add(ComplexNumber another) {
        ComplexNumber result = new ComplexNumber();
        result.realPart = realPart + another.realPart;
        result.imagePart = imagePart + another.imagePart;
        return result;
    }

    public ComplexNumber sub(ComplexNumber another) {
        ComplexNumber result = new ComplexNumber();
        result.realPart = realPart - another.realPart;
        result.imagePart = imagePart - another.imagePart;
        return result;
    }

    public ComplexNumber muti(ComplexNumber another) {
        ComplexNumber result = new ComplexNumber();
        result.realPart = realPart * another.realPart - imagePart * another.imagePart;
        result.imagePart = realPart * another.imagePart + imagePart * another.realPart;
        return result;
    }

    public ComplexNumber div(ComplexNumber another) {
        ComplexNumber result = new ComplexNumber();
        result.realPart = (realPart * another.realPart + imagePart * another.imagePart) / (Math.pow(another.realPart, 2) + Math.pow(another.imagePart, 2));
        result.imagePart = (imagePart * another.realPart - realPart * another.imagePart) / (Math.pow(another.realPart, 2) + Math.pow(another.imagePart, 2));
        return result;
    }

    public String toString() {
        if (realPart == 0 && imagePart == 0) {
            return "0";
        } else if (imagePart == 0) {
            return realPart + "";
        } else if (realPart == 0) {
            return imagePart + "i";
        } else if (imagePart > 0) {
            return realPart + "+" + imagePart + "i";
        } else {
            return realPart + "" + imagePart + "i";
        }
    }
}
