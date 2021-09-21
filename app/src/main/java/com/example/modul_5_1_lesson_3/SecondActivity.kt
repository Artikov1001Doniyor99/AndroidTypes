package com.example.modul_5_1_lesson_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar?.hide()
        setContentView(R.layout.activity_second)

        val intent_sec = intent
        val imageData =intent_sec.getSerializableExtra("image") as ImageData

        if(imageData.text == "Cup Cake") {
            text_Sec.text = "Android Cupcake  (1.5 -versiya ) - bu Google tomonidan ishlab chiqilgan Android -ning uchinchi versiyasi bo'lib, u 2009 yilning aprelidan beri Android mobil telefonlarida ishlab chiqarila boshlangan va endi qo'llab -quvvatlanmaydi. Chiqarish foydalanuvchilar va ishlab chiquvchilar uchun yangi xususiyatlarni, shuningdek, Android framework API -dagi o'zgarishlarni o'z ichiga oldi. Ishlab chiquvchilar uchun Android 1.5 platformasi Android SDK uchun yuklab olinadigan komponent sifatida mavjud edi.\n" +
                    "\n" +
                    "Android 1.5 ekranli klaviatura va Bluetooth-ni qo'llab-quvvatlash kabi yangi xususiyatlarni, shuningdek, ilovalarni boshqarish uchun foydalanuvchi interfeysini o'zgartirish va bir nechta Google ilovalarini o'zgartirish kabi mavjud xususiyatlarni yaxshilaydi [1] ."
        }else{
            if (imageData.text == "Donut"){
                text_Sec.text = "Android \"Donut\"  - bu Google tomonidan ishlab chiqilgan Android mobil operatsion tizimining ochiq manbali versiyasi bo'lib, u endi qo'llab -quvvatlanmaydi. Ushbu yangilanishning diqqatga sazovor xususiyatlariga CDMA smartfonlarini qo'llab-quvvatlash , qo'shimcha ekran o'lchamlari, batareyadan foydalanish ko'rsatkichi va matnli nutq dvigateli kiradi [1] [2] .\n" +
                        "\n" +
                        "\"Donut\" ning ommaviy nomi chiqarilgandan so'ng, uning rasmiy shirin nomli kod nomi, Google tomonidan Android media-ning asosiy versiyalariga murojaat qilish uchun ishlatilgan konvensiya tezda xaridorlarga mos keladigan smartfonlar uchun havodan (OTA) yangilanishi sifatida taqdim etildi.\n" +
                        "\n" +
                        "Hozirgi vaqtda qo'llab -quvvatlash to'xtatilgan."

            }else{
                if (imageData.text == "Eclair"){
                    text_Sec.text = "Android \"Eclair\"  - bu Google tomonidan ishlab chiqilgan, endi qo'llab -quvvatlanmaydigan 2.0 dan 2.1 gacha bo'lgan versiyalar uchun Android mobil operatsion tizimining versiyasi.\n" +
                            "\n" +
                            "2009 yil 26 oktyabrda nashr etilgan Android 2.1 Android 1.6 \"Donut\" ning muhim o'zgarishlariga asoslanadi .\n" +
                            "\n" +
                            "Qo'llab -quvvatlash muddati 2017 yil 30 -iyunda tugadi."
                }else{
                    if (imageData.text == "Froya"){
                        text_Sec.text = "Android \"Froyo\"  - bu Google tomonidan ishlab chiqilgan Android mobil operatsion tizimining 2.2 dan 2.2.3 gacha bo'lgan versiyasi [1] . Bu versiyalar endi qo'llab -quvvatlanmaydi. U 2010 yil 20 mayda Google I / O 2010 konferentsiyasi paytida ochilgan .\n" +
                                "\n" +
                                "Froyo muammosidagi eng sezilarli o'zgarishlardan biri USB - modem va Wi-Fi-ulanish nuqtasi [2] dan foydalanish bo'ldi .\n" +
                                "\n" +
                                "Boshqa o'zgarishlarga Android Cloud to Device Messaging (C2DM) xizmatini qo'llab-quvvatlash, push- bildirishnomalarni yoqish , JIT-kompilyatsiya qilingan ilova tezligini oshirish [3] kiradi va ilovalarda yuqori bannerlar sifatida ko'rinadi.\n" +
                                "\n" +
                                "2016 yil 9 -yanvar holatiga ko'ra, Google tomonidan e'lon qilingan statistik ma'lumotlarga ko'ra, Google Play -ga kirish huquqiga ega bo'lgan barcha Android qurilmalarining 0,1% dan kamrog'i Froyo -da ishlaydi, bu shuni anglatadiki, bu versiya endi ishlatilmaydi."
                    }else{
                        if (imageData.text == "Gingerbread"){
                            text_Sec.text = "Android \"Gingerbread\"  - bu Google tomonidan ishlab chiqilgan va 2010 yil dekabrda chiqarilgan Android mobil operatsion tizimining versiyasi . Bu versiya endi qo'llab -quvvatlanmaydi.\n" +
                                    "\n" +
                                    "Gingerbread relizi qo'llab-quvvatlash joriy NFC protokoli, mobil to'lov tizimlarida ishlatiladi, va tizimga boshlash protokoli ( SIP ishlatiladigan), VoIP telefoniya [1] .\n" +
                                    "\n" +
                                    "Gingerbread -ning foydalanuvchi interfeysi o'rganishni osonlashtirish, undan tezroq foydalanish va energiyani tejash uchun yaxshilandi. Qora fonli soddalashtirilgan rang sxemasi xabarlar paneli, menyular va boshqa UI komponentlariga yorqinlik va kontrast qo'shdi. Menyu va sozlamalarning yaxshilanishi tufayli navigatsiya va tizim boshqaruvi osonlashdi.\n" +
                                    "\n" +
                                    "2010 yilda chiqarilgan Nexus S smartfoni Google Nexus liniyasidan Gingerbread-ni ishga tushirgan birinchi telefon, shuningdek, NFC-ning o'rnatilgan funksiyasiga ega bo'lgan birinchi telefon edi [2] .\n" +
                                    "\n" +
                                    "Gingerbread Linux yadrosining 2.6.35 versiyasidan foydalanadi .\n" +
                                    "\n" +
                                    "2018 yil sentyabr holatiga ko'ra, Google tomonidan e'lon qilingan statistika shuni ko'rsatadiki, Google Play -ga kirish huquqiga ega bo'lgan barcha Android qurilmalarining 0,3% Gingerbread -dan foydalanadi [3] ."
                        }else{
                            if (imageData.text == "Kitkat"){
                                text_Sec.text = "Android KitKat  - Google tomonidan ishlab chiqilgan Android mobil operatsion tizimining versiyasi . 2013 yil 31 oktyabrda taqdim etilgan.\n" +
                                        "\n" +
                                        "2019 yil sentyabr holatiga ko'ra, Google tomonidan chiqarilgan statistik ma'lumotlarga ko'ra, Google Play -ga kirish huquqiga ega bo'lgan barcha Android qurilmalarining 3,36% KitKat -da ishlaydi. Bu skeomorfik dizayndan foydalangan Android -ning oxirgi versiyasi. Keyingi barcha versiyalarda Material Design uslubidagi tekis dizayn ishlatiladi ."
                            }else{
                                if (imageData.text == "Lollipop"){
                                    text_Sec.text = "Android Lollipop  - bu Android mobil operatsion tizimining versiyasi . 2014 yil 25 -iyunda ommaga taqdim etilgan va Android L nomi bilan Google Nexus seriyasining ayrim modellari uchun beta -versiya sifatida chiqarilgan . Rasmiy chiqarilishi 2014 yil 3 -noyabrda bo'lib o'tgan [2] . Chiqarish versiyasining manba kodi ishlab chiqaruvchilarga 2014 yil 4 -noyabrda taqdim etilgan [3] .\n" +
                                            "\n" +
                                            "Android Lollipop -dagi eng aniq o'zgarishlarga mualliflar tomonidan chaqirilgan yangi foydalanuvchi interfeysi kiradi Moddiy dizayn , uning asosiy printsiplari soyalar, dizayndagi qog'oz qatlamlarini eslatuvchi, yorqin, lekin ayni paytda ko'proq ma'lumotli, takomillashtirilgan xabarlar. endi qulflangan ekranda va ekranning yuqori qismidagi har qanday ilovada mavjud. Ichki o'zgarishlar Android Runtime Virtual Machine (ART) ga o'tishga asoslangan bo'lib, Dalvikni rasman ish faoliyatini yaxshilash va tizimning energiya samaradorligini oshirish uchun optimallashtirishga almashtirdi .\n" +
                                            "\n" +
                                            "2019 yil sentyabr holatiga ko'ra, Google tomonidan e'lon qilingan statistik ma'lumotlarga ko'ra, Lollipop versiyalari Google Play -ga kirish huquqiga ega bo'lgan barcha Android qurilmalarining 10,65 foiziga ega ."
                                } else{
                                    text_Sec.text = "\"Much More\" loyihasi-bu Danilovskiy bozorida mashhur bo'lgan #FishBazaar korxonalari (restavratorlari Sergey Marushkin va Ekaterina Shengerskaya) va Porto-Malta baliq restoranlari tarmog'ining yaratuvchilarining mutlaqo yangi hamkorligi.\n" +
                                            "\n" +
                                            "Ko'proq narsalarning asosiy kontseptsiyasi - O'rta er dengizi futuristik dizayndagi kafe bo'lib, u erda siz serb oshpazidan har qanday shaklda yangi baliq va dengiz mahsulotlarini, engil atıştırmalıklardan tortib, issiq taomlargacha tatib ko'rishingiz mumkin, bu erda hamma narsa faqat sovutilgan mahsulotlardan tayyorlanadi. Har qanday tashrif buyuruvchi pishirish usulini o'zi, klassik panjara qilingan baliqni, xom -ashyoni yoki tortish formatini tanlashi mumkin bo'ladi."
                                }
                            }
                        }
                    }
                }
            }
        }
        imagE.setImageResource(imageData.img)


    }
}