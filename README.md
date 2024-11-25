# Decorator Tasarım Deseni

Yapısal tasarım desenlerinden biri olan **Decorator tasarım deseni**, sınıfın yapısında değişikliğe gidilmeden belirli bir nesneye veya bazı nesnelere yeni ek fonksiyon ve özelliklerin dinamik olarak eklenmesi için kullanılmaktadır. 

Bu desendeki önemli kısım, yeni özellik sınıfa değil **belirli nesneye** kazandırılır. Aynı sınıftan üretilen diğer nesneler bu durumdan etkilenmez. 

Bu desen ile:
- Farklı kombinasyonlar için çok sayıda sınıf oluşturmak gerekmez.
- Kodun okunabilirliğini ve esnekliğini artırır.
- Hızlı ve dinamik sonuçlar üretir.
- **Open-Closed Prensibi**'ne uygundur, yani sınıfları geliştirilmeye açık ancak değiştirilmeye kapalı tutar.

### Decorator Tasarım Deseni Kullanım Alanları
Decorator tasarım deseni şu durumlarda kullanılabilir:
1. **Runtime** zamanında bir nesneye yeni özellikler eklemek istiyorsak.
2. Farklı kombinasyonlar için çok sayıda sınıf üretmemiz gerekiyorsa.
3. Bir sınıfa değiştirilmeden yeni özellik eklenmesi gerekiyorsa.
4. Bir sınıfa eklenecek özellikler belirli koşullara bağlı olarak eklenmesi gerekiyorsa.

### Decorator Tasarım Deseni Bileşenleri
Decorator tasarım deseni başlıca şu yapılardan oluşur:

- **Component (Bileşen):** Genişletilecek ve yeni özellikler eklenecek olan metodun arayüz yapısıdır. Nesne ve dekoratörler uygulayabilir. 
- **Concrete Component (Somut Bileşen):** Geliştirmek veya değiştirmek istediğimiz nesnedir. Temel işlevselliği sağlar ve `Component` arayüzünü uygular.
- **Decorator (Dekoratör):** `Component` arayüzünü uygular. Bir bileşen nesnesine bir referans içerir ve çağrıları altta yatan bileşene devrederek yeni davranışlar ekler veya mevcut davranışları değiştirebilir. 
- **Concrete Decorator (Somut Dekoratör):** `Decorator` temelini genişletir. Her somut dekoratör, nesneye belirli bir işlevsellik veya davranış ekler. 

---

## Örnek Uygulama

Bir **prefabrik ev firması** senaryosunu ele alalım:

- Temel 1 odalı ev fiyatı olsun.
- Eklenen her oda, kapı ve pencere fiyatı artırmalı.
- **Amaç:** Müşteri istekleri sonucunda oluşan ev bilgisini ve fiyatını dinamik olarak hesaplamak.

### Çözüm
Decorator tasarım deseni kullanarak:
- Her müşteri için temel ev planı üzerinden özelleştirme yapılabilir.
- Eklenen her oda, kapı ve pencere, farklı `Concrete Decorator` sınıflarıyla temsil edilebilir.

Bu belirlenen çözümün uygulanmış kodları yukarıda bulunduğu gibidir.

