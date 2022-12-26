import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.Test;

public class DragAndDrop {
  @Test
  void dragAndDropTest(){
    //Откройте страницу drug and drop
    open("https://the-internet.herokuapp.com/drag_and_drop");
    //Перенести прямоугольник А на место В
    $("#column-a").dragAndDropTo("#column-b");
    //Проверка, что прямоугольники действительно поменялись
    $("#column-a").$("header").shouldHave(text("B"));
  }
}
