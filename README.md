#  Java OOP Challenge 

### Proje Kurulumu

Projeyi öncelikle forklayın ve clone edin.
Daha sonra projeyi IntellijIDEA kullanarak açınız. README.md dosyasını dikkatli bir şekilde okuyarak istenenleri yapmaya çalışın.
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:

### Workintech Burger Company

 * Uygulamanın amacı, Workintech Burger adlı bir şirketin hamburgerlerini satma sürecini yönetmesine yardımcı olmaktır. 
 * İlk başta 3 tane yeni sınıf oluşturmalısınız. ```Hamburger```, ```DeluxeBurger```, ```HealthyBurger```(Hamburger sınıfını ana sınıf olarak dizayn etmelsiniz)
 * Hamburger sınıfı içerisinde 4 tane değişken tanımlamalısınız. ```name```, ```meat```, ```price```, ```breadRollType``` price değişkeni double olmalı. Kalanları String olarak tanımlayabilirsiniz.
 * Hamburger'in üzerine başka malzemeler eklenebilir. Bunları şu isimlerle tutmalıyız. addition1Name, addition1Price, addition2Name, addition2Price, addition3Name, addition3Price, addition4Name ve addition4Price. İsim tutan değişkenler String olmalı, price tutan değişkenler double olarak tanımlanmalı.
 * Hamburger sınıfı içerisine malzemelerin eklenmesi için 5 tane daha metod eklemeliyiz. 4 tanesi ilgili malzemenin eklenmesi için. 1 tane de tüm eklenen malzemelerin görüntülenmesi için.
 * Metodları şu isimle adlandırabilirsiniz. ```addHamburgerAddition1```, ```addHamburgerAddition2```, ```addHamburgerAddition3```, ```addHamburgerAddition4``` ve ```itemizeHamburger```
 * addHamburgerAddition metodları 2 tane parametre almalı malzemenin ismi ve ücreti ve hiçbir değer dönmemeli. itemizeHamburger hem tüm malzemeleri ekrana basmalı. Hem de toplam ücreti(hamburger + tüm malzemeler) değer olarak dönmeli.

 * İkinci sınıfımız ```DeluxeBurger```, constructor metodu içerisinde otomatik olarak ```cips``` ve bir ```drink``` ekler. default olarak price değişkenini ```19.10$``` olarak oluşturur.
 * DeluxeBurger için hiçbir şekilde ek malzeme eklenemez. Ek malzeme eklemesi yapana tüm metodlar ```override``` edilmeli ve İçlerine bu işlemin yapılamayacağına dair bir mesaj eklenmeli.

 * Üçüncü sınıfımız ```HealthyBurger``` İçerisinde 4 tane değişken alabilir. ```healthyExtra1Name```, ```healthyExtra1Price```, ```healthyExtra2Name```, ```healthyExtra2Price``` Name değişkenleri String olmalı, price değişkenleri double olmalı.
 * İki tane metod eklemeliyiz. ```addHealthyAddition1``` ve ```addHealthyAddition2```. 2 tane parametre almalı malzemenin ismi ve ücreti sonunda hiçbir değer dönmemeli. 
 * ```itemizeHamburger``` metodunu override edilmeli. itemizeHamburger hem tüm malzemeleri ekrana basmalı. Hem de toplam ücreti(HealthyHamburger + tüm malzemeler)

### Input

Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");

hamburger.addHamburgerAddition1("Tomato", 0.27);

hamburger.addHamburgerAddition2("Lettuce", 0.75);

hamburger.addHamburgerAddition3("Cheese", 1.13);

System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);

healthyBurger.addHamburgerAddition1("Egg", 5.43);

healthyBurger.addHealthyAddition1("Lentils", 3.41);

System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

DeluxeBurger db = new DeluxeBurger();

db.addHamburgerAddition3("Should not do this", 50.53);

System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());

### Output

Basic hamburger on a White roll with Sausage, price is 3.56

Added Tomato for an extra 0.27

Added Lettuce for an extra 0.75

Added Cheese for an extra 1.13

Total Burger price is 5.71

Healthy hamburger on a Brown rye roll with Bacon, price is 5.67

Added Egg for an extra 5.43

Added Lentils for an extra 3.41

Total Healthy Burger price is  14.51

Cannot not add additional items to a deluxe burger

Deluxe hamburger on a White roll with Sausage & Bacon, price is 14.54

Added Chips for an extra 2.75

Added Drink for an extra 1.81

Total Deluxe Burger price is 19.10


### Opsiyonel Görevler
* breadRollType değişkenini Enum tipinde tanımlayınız. 
* Hamburgerlere eklediğimiz tüm malzemeler için ayrı bir sınıf yazınız. ```Addition``` isminde adlandırılabilir. Composition özelliğinden yararlanarak tüm malzeme ekleme işlemlerini Addition sınıfı üzerinden yönetmeye çalışın.
