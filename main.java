/* Программа, предположительно, производит генерирование персонажа для игры в D&D
 * по задумке, при вводе определённого числа, программа генерирует персонажа заданной расы и заданного класса.
 * 0.0 Предоставвляется выбор - автоматическое создание или ручное.
 * 0.1 Если автоматический, то программа должна сама создать персонажа случайной расы и случайного класса.
 * 0.2 Если ручной, то:
 * 0.2.1 Предоставляется выбор расы.
 * 0.2.2 Предоставляется выбор класса.
 * 0.2.3 Генерируются значения характеристик в случайном порядке.                                                     */

import com.sun.deploy.security.SelectableSecurityManager;
import javax.crypto.spec.PSource;
import java.util.*;
class Create_Unit //++++++++++++++++++++++=-> создание Unit'a <-=+++++++++++++++++++++++++++++++++++++++++++++++++++++++
{
    public String Unit_Race(int race_in)
    {
        String [] race_array = {"Дварф", "Эльф", "Полурослик", "Человек", "Дроконорожденный", "Гном", "Полуэльф", "Полуорк", "Тифлинг"};
        return race_array[race_in - 1];

    }
    public String Unit_Gender(int gender_in)
    {
        String [] gender_array = {"Мужской", "Женский"};
        return gender_array[gender_in - 1];
    }
    public String Unit_Class(int clas_in)
    {
        String [] class_array = {"Варвар","Бард","Жрец","Друид","Воин","Монах","Паладин","Следопыт","Плут","Чародей","Колдун","Волшебник"};
        return class_array[clas_in - 1];
    }
}
class Dwarf //++++++++++++++++++++++++++++=-> класс Дварф <-=+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
{
    static void Name_Person (String gender_in)//++++++++++++++++++++++=-> выбор имени в зависимости от пола <-=++++++++++++
    {
        Random rand = new Random();
        if (gender_in == "Мужской")
        {
            int dwarf_male_size = 30;
            int dwarf_male_choice = (rand.nextInt(dwarf_male_size) + 1);
            String [] Dwarf_Names_Male = {"Адрик","Альберих","Баренд","Баэрн","Броттор","Бруенор","Вондал","Вэйт","Гардаин","Даин",
                    "Даррак","Делг","Килдрак","Моргран","Орсик","Оскар","Рангрим","Рюрик","Талклин","Торадин","Тордек",
                    "Торин","Травок","Траубон","Ульфгар","Фаргрим","Флинт","Харбек","Эберк","Эйнкиль"};
            System.out.println ("\nИмя: " + Dwarf_Names_Male[dwarf_male_choice]);
        }
        else
        {
            int dwarf_female_array_size = 23;
            int dwarf_female_choice = (rand.nextInt(dwarf_female_array_size) + 1);
            String [] Dwarf_Names_Female = {"Артин","Бардрин","Вистра","Гуннлода","Гурдис","Дагнал","Диеза","Илде","Катра","Кристид",
                    "Лифтраса","Мардред","Одхильд","Рисвин","Саннл","Тробера","Торгга","Фалкрунн","Финеллен","Хельджа","Хлин",
                    "Эльдет","Эмбер"};
            System.out.println ("\nИмя: " + Dwarf_Names_Female[dwarf_female_choice - 1]);
        }
        int dwarf_clans_array_size = 15;
        String [] Clans = {"Балдерк","Боевой молот","Горунн","Данкил","Железный кулак","Крепкая наковальня","Ледяная борода",
                "Лодерр","Лютгер","Огненная кузня","Рамнахейм","Стракелн","Торунн","Унгарт","Холдерхек"};
        int dwarf_clan_choice = (rand.nextInt(dwarf_clans_array_size) + 1);
        System.out.println ("Клан: " + Clans[dwarf_clan_choice - 1]);
    }
    static void Discription_Dwarf ()
    {
        String s = " ";
        s = "Описание: Полные древнего величия королевства и вырезанные в толще гор чертоги, удары кирок и молотков," +
        " раздающиеся в глубоких шахтах и пылающий кузнечный горн, верность клану и традициям и пылающая ненависть " +
        "к гоблинам и оркам - вот вещи, объединяющие всех дварфов. Смелые и выносливые дварфы известны как опытные воины," +
        " шахтёры, каментёсы и металлурги. Хотя они и не превышают 152 сантиметров в высоту, дварфы настолько широкоплечие" +
        " и плотные, что весят столько же, сколько превосходящий их в росте на 60 сантиметров, человек. Их отвага и " +
        "выносливость так же не уступает представителям более высоких народов. Кожа у дварфов бывает от тёмно-коричневой" +
        " до светлой, с красным оттенком. Наиболее распространённые оттенки - светло-коричневый или смуглый, как разные" +
        " виды земли. Их волосы, которые они носят длинными, но собранными в простые прически, обычно чёрного, серого или" +
        " коричневого цвета, но у дварфов с бледной кожей часто встречаются рыжие волосы. Дварфы мужчины очень ценят свои" +
        " бороды и тщательно за ними ухаживают. Дварфы могут жить более 400 лет, и старейшие из них часто помнят этот мир" +
        " сильно отличным от нынешнего. Дварфы стойкие и выносливые. как горы, в которые они влюблены. Они уважают традиции" +
        " своих кланов, прослеживая их родословную до самого основания древнейших твердынь на рассвете молодого мира, и не" +
        " отказываются от этих традиций с легкостью. Частью этих традиций является преданность богам дварфов, которые поощряют" +
        " присущие дварфам идеалы: прележный труд, сноровку в бою и любовь к кузнечному горну. Дварфам присущи непреклонность" +
        " и лояльность, верность своему слову, решительность в действиях, временами переходящее в упрямство. У многих дварфов" +
        " сильно развито чувство справедливости, и они медленно прощают причинённое им зло. Зло причинённое дварфу, это зло," +
        " причинённное всему его клану. Таким образом, попытка отомстить одному дварфу может превратиться во вражду," +
        " захлестнувшую целый клан.";
        char [] discr = s.toCharArray();
        for (int i = 0; i < discr.length; i++)
        {
            if ((i > 1) && (i % 160 == 0))
                System.out.print(discr[i] + "\n");
            else
                System.out.print(discr[i]);
        }
        //String line_out = new String(discr);
        //System.out.println(line_out);
    }
}
class Elf //++++++++++++++++++++++++++++++=-> класс Эльф <-=++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
{
    static void Name_Person (String gender)
    {
        Random rand = new Random();
        if (gender == "Мужской")
        {
            int elf_male_size = 29;
            String [] Elf_Male_Names = {"Адран","Арамиль","Араннис","Ауст","Аэлар","Бейро","Берриан","Варис","Галинндан","Ивеллиос",
                    "Иммераль","Каррик","Куарион","Лаусиан","Мандартис","Паэлиас","Перен","Риардон","Ролен","Совелисс","Тамиорн",
                    "Таривол","Терен","Хадарай","Химо","Хэйян","Эниалис","Эрдан","Эреван"};
            int elf_male_choice = (rand.nextInt(elf_male_size) + 1);
            System.out.println("Имя: " + Elf_Male_Names[elf_male_choice - 1]);
        }
        else
        {
            int size = 30;
            String [] Names_female = {"Адрие","Альтеа","Анастрианна","Андрасте","Антинуа","Бетринна","Бирель","Вадания","Валанте",
                    "Джеленетт","Друсилиа","Йелениа","Каэлинн","Квеленна","Квиласи","Кейлет","Ксанафия","Лешанна","Лиа","Миали",
                    "Мэриэль","Найвара","Сариэль","Силакви","Теирастра","Тиа","Фелосиаль","Шава","Шанайра","Энна"};
            int choice = (rand.nextInt(size) + 1);
            System.out.println("Имя: " + Names_female[choice - 1]);
        }
        int size = 9;
        String [] Surnames = {"Амакиир (Сверкающий Цветок)","Амастасия (Звёздный Цветок)","Галанодель (Лунный Шёпот)",
                "Ильфелкиир (Сверкающий Бутон)","Ксилосент (Золотой Лепесток)","Лиадон (Серебрянный Лист)","Найло (Ночной Бриз)",
                "Сианодель (Лунный Ручей)","Холимион (Алмазная Роса)"};
        int choice = (rand.nextInt(size) + 1);
        System.out.println("Фамилия: " + Surnames[choice - 1]);
    }
}
class Halfling //+++++++++++++++++++++++++=-> класс Полурослик <-=++++++++++++++++++++++++++++++++++++++++++++++++++++++
{
    static void Name_Person(String gender)
    {
        Random rand = new Random();
        if (gender == "Мужской")
        {
            int size = 17;
            String [] Names_Male = {"Альтон","Андер","Гаррет","Кейд","Коррин","Лайл","Линдал","Майло","Меррик","Осборн","Перрин",
                    "Рид","Роско","Уэллби","Финнан","Элдон","Эррих"};
            int choice = (rand.nextInt(size) + 1);
            System.out.println("Имя: " + Names_Male[choice - 1]);
        }
        else
        {
            int size = 18;
            String [] Names_Female = {"Бри","Вани","Верна","Джиллиан","Китри","Кора","Кэлли","Лавиния","Лидда","Мерла","Недда",
                    "Паэла","Портия","Серафина","Трим","Шаэна","Эндри","Юфемия"};
            int choice = (rand.nextInt(size) + 1);
            System.out.println("Имя: " + Names_Female[choice - 1]);
        }
        int size = 10;
        String [] Surnames = {"Вверхтормашкин","Высокохолм","Галькоброс","Добробочка","Зеленофляг","Кустосбор","Лугодуг",
                "Подветкин","Репейник","Чайнолист"};
        int choice = (rand.nextInt(size) + 1);
        System.out.println("Фамилия: " + Surnames[choice - 1]);
    }
}
class Human //++++++++++++++++++++++++++++=-> класс Человек <-=+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
{
    static void Name_Person(String gender)
    {
        Random rand = new Random();
        int size_ethnos = 9;
        String [] Ethnos = {"Дамарец","Иллусканец","Калишит","Мулан","Рашеми","Тетирец","Тёрами","Чондатанец","Шу"};
        int choice_ethnos = (rand.nextInt(size_ethnos) + 1);
        System.out.println("Этнос: " + Ethnos[choice_ethnos - 1]);
        if (Ethnos[choice_ethnos - 1] == "Дамарец")//++++++++++=-> этнос Дамарец <-=++++++++++++++++++++++++++++++++++++
        {
            if (gender == "Мужской")
            {
                int damar_male_size = 11;
                String [] Damar_Names_Male = {"Айвор","Бор","Глэр","Григор","Иган","Козеф","Миваль","Орел","Павел","Сергор","Фодель"};
                int damar_male_choice = (rand.nextInt(damar_male_size) + 1);
                System.out.println("Имя: " + Damar_Names_Male[damar_male_choice - 1]);
            }
            else
            {
                int damar_female_size = 8;
                String [] Damar_Names_Female = {"Алетра","Зора","Кара","Катернин","Мара","Натали","Ольма","Тана"};
                int damar_female_choice = (rand.nextInt(damar_female_size) + 1);
                System.out.println("Имя: " + Damar_Names_Female[damar_female_choice - 1]);
            }
            int damar_surnames_size = 8;
            String [] Damar_Surnames = {"Берск","Дотск","Куленов","Марск","Немецк","Стараг","Чернин","Шемов"};
            int damar_surnames_choice = (rand.nextInt(damar_surnames_size) + 1);
            System.out.println("Фамилия: " + Damar_Surnames[damar_surnames_choice - 1]);
        }
        if (Ethnos[choice_ethnos - 1] == "Иллусканец")//++++++++++=-> этнос Иллусканец <-=++++++++++++++++++++++++++++++
        {
            if (gender == "Мужской")
            {
                int iluskan_male_size = 11;
                String [] Iluskan_Names_Male = {"Блас","Бран","Гет","Ландер","Лют","Малсер","Стор","Таман","Урт","Фрат","Эндер"};
                int iluskan_choice = (rand.nextInt(iluskan_male_size) + 1);
                System.out.println("Имя: " + Iluskan_Names_Male[iluskan_choice - 1]);
            }
            else
            {
                int iluskan_female_size = 8;
                String [] Iluskan_Names_Female  = {"Амафрея","Бетха","Вестра","Кетра","Мара","Ольга","Силифрей","Цефрея"};
                int iluskan_female_choice = (rand.nextInt(iluskan_female_size) + 1);
                System.out.println("Имя: " + Iluskan_Names_Female[iluskan_female_choice - 1]);
            }
            int iluskan_surnames_size = 6;
            String [] Iluskan_Surnames  = {"Брайтвуд","Виндривер","Лакмэн","Хелдер","Хорнрейвен","Штормвинд"};
            int iluskan_surnames_choice = (rand.nextInt(iluskan_surnames_size) + 1);
            System.out.println("Фамилия: " + Iluskan_Surnames[iluskan_surnames_choice - 1]);
        }
        if (Ethnos[choice_ethnos - 1] =="Калишит")//++++++++++=-> этнос Калишит <-=+++++++++++++++++++++++++++++++++++++
        {
            if (gender == "Мужской")
            {
                int kalishit_male_size = 7;
                String [] Kalishit_Names_Male = {"Асеир","Бардеид","Зашеир","Кхемед","Мехмен","Судейман","Хасеид"};
                int kalishit_male_choice = (rand.nextInt(kalishit_male_size) + 1);
                System.out.println("Имя: " + Kalishit_Names_Male[kalishit_male_choice - 1]);
            }
            else
            {
                int kalishit_female_size = 8;
                String [] Kalishit_Names_Female = {"Атала","Джасмаль","Зашеида","Мейлиль","Сейдиль","Сейпора","Хама","Яшеира"};
                int kalishit_female_choice = (rand.nextInt(kalishit_female_size) + 1);
                System.out.println("Имя: " + Kalishit_Names_Female[kalishit_female_choice - 1]);
            }
            int kalishit_surnames_size = 7;
            String [] Kalishit_Surnames = {"Баша","Джассан","Думеин","Кхалид","Мостана","Пашар","Рейн"};
            int kalishit_surnames_choice = (rand.nextInt(kalishit_surnames_size) + 1);
            System.out.println("Фамилия: " + Kalishit_Surnames[kalishit_surnames_choice - 1]);
        }
        if (Ethnos[choice_ethnos - 1] == "Мулан")//++++++++++=-> этнос Мулан <-=++++++++++++++++++++++++++++++++++++++++
        {
            if (gender == "Мужской")
            {
                int mulan_male_size = 9;
                String [] Mulan_Names_Male = {"Аот","Берерис","Кетот","Мумед","Рамас","Со-Кехур","Тхазар-Де","Урхур","Эхпут-Ки"};
                int mulan_male_choice = (rand.nextInt(mulan_male_size) + 1);
                System.out.println("Имя: " + Mulan_Names_Male[mulan_male_choice - 1]);
            }
            else
            {
                int mulan_female_size = 9;
                String [] Mulan_Names_Female = {"Аризима","Золис","Мурити","Нефис","Нулара","Сефрис","Тола","Умара","Чатхи"};
                int mulan_female_choice = (rand.nextInt(mulan_female_size) + 1);
                System.out.println("Имя: " + Mulan_Names_Female[mulan_female_choice - 1]);
            }
            int mulan_surnames_size = 7;
            String [] Mulan_Surnames = {"Анкхалаб","Анскульд","Натандем","Серпет","Уутракт","Фезим","Хахпет"};
            int mulan_surnames_choice = (rand.nextInt(mulan_surnames_size) + 1);
            System.out.println("Фамилия: " + Mulan_Surnames[mulan_surnames_choice - 1]);
        }
        if (Ethnos[choice_ethnos - 1] == "Рашеми")//++++++++++=-> этнос Рашеми <-=++++++++++++++++++++++++++++++++++++++
        {
            if (gender == "Мужской")
            {
                int rashemi_male_size = 8;
                String [] Rashemi_Names_Male = {"Боривик","Владислак","Джандар","Канитар","Мадислак","Ральмевик","Фаургар","Шаумар"};
                int rashemi_male_choice = (rand.nextInt(rashemi_male_size) + 1);
                System.out.println("Имя: " + Rashemi_Names_Male[rashemi_male_choice - 1]);
            }
            else
            {
                int rashemi_female_size = 8;
                String [] Rashemi_Names_Female = {"Имзель","Иммит","Наварра","Таммит","Файварра","Хульмарра","Шеварра","Юльдра"};
                int rashemi_female_choice = (rand.nextInt(rashemi_female_size) + 1);
                System.out.println("Имя: " + Rashemi_Names_Female[rashemi_female_choice - 1]);
            }
            int rashemi_surnames_size = 6;
            String [] Rashemi_Surnames = {"Дайрнина","Илтазяра","Мурнитара","Стаянога","Улмокина","Чергоба"};
            int rashemi_surnames_choice = (rand.nextInt(rashemi_surnames_size) + 1);
            System.out.println("Фамилия: " + Rashemi_Surnames[rashemi_surnames_choice - 1]);
        }
        if ((Ethnos[choice_ethnos - 1] == "Тетирец") || (Ethnos[choice_ethnos - 1]) == "Чондатанец")//++++++++++=-> парный этнос <-=+++++++++++++++++
        {
            if (gender == "Мужской")
            {
                int couple_male_size = 10;
                String [] Couple_Names_Male = {"Горстаг","Грим","Дарвин","Дорн","Маларк","Морн","Рэндал","Стедд","Хельм","Эвендур"};
                int couple_male_choice = (rand.nextInt(couple_male_size) + 1);
                System.out.println("Имя: " + Couple_Names_Male[couple_male_choice - 1]);
            }
            else
            {
                int couple_female_size = 9;
                String [] Couple_Names_Female = {"Арвин","Джессаиль","Керри","Лурин","Мири","Рован","Тесселе","Шандри","Эсвель"};
                int couple_female_choice = (rand.nextInt(couple_female_size) + 1);
                System.out.println("Имя: " + Couple_Names_Female[couple_female_choice - 1]);
            }
            int couple_surnames_size = 6;
            String [] Couple_Surnames = {"Бакмэн","Грэйкасл","Дандрэгон","Толстаг","Эвенвуд","Эмблкроун"};
            int couple_choice = (rand.nextInt(couple_surnames_size) + 1);
            System.out.println("Фамилия: " + Couple_Surnames[couple_choice - 1]);
        }
        if (Ethnos[choice_ethnos - 1] == "Тёрами")//++++++++++=-> этнос Тёрами <-=++++++++++++++++++++++++++++++++++++++
        {
            if (gender == "Мужской")
            {
                int terami_male_size = 8;
                String [] Terami_Names_Male = {"Антон","Диеро","Маркон","Пьерон","Римардо","Ромеро","Салазар","Умберо"};
                int terami_male_choice = (rand.nextInt(terami_male_size) + 1);
                System.out.println("Имя: " + Terami_Names_Male[terami_male_choice - 1]);
            }
            else
            {
                int terami_female_size = 9;
                String [] Terami_Names_Female = {"Балама","Вонда","Джалана","Дона","Куара","Луиза","Марта","Селизе","Фаила"};
                int tearmi_female_choice = (rand.nextInt(terami_female_size) + 1);
                System.out.println("Имя: " + Terami_Names_Female[tearmi_female_choice - 1]);
            }
            int terami_surnames_size = 8;
            String [] Terami_Surnames = {"Агосто","Асторио","Домине","Калабра","Маривальди","Писакар","Рамондо","Фалоне"};
            int terami_surnames_choice = (rand.nextInt(terami_surnames_size) + 1);
            System.out.println("Фамилия: " + Terami_Surnames[terami_surnames_choice - 1]);
        }
        if (Ethnos[choice_ethnos - 1] == "Шу")//++++++++++=-> этнос Шу <-=++++++++++++++++++++++++++++++++++++++++++++++
        {
            if (gender == "Мужской")
            {
                int shu_male_size = 13;
                String [] Shu_Names_Male = {"Ан","Вэнь","Лонг","Лянь","Менг","Он","Фай","Цзюн","Цзянь","Чен","Чи","Шань","Шуй"};
                int shu_names_male_choice = (rand.nextInt(shu_male_size) + 1);
                System.out.println("Имя: " + Shu_Names_Male[shu_names_male_choice - 1]);
            }
            else
            {
                int shu_female_size = 8;
                String [] Shu_Names_Female = {"Бай","Ксяо","Лей","Мей","Тай","Цзя","Чао","Шуй"};
                int shu_names_female_choice = (rand.nextInt(shu_female_size) + 1);
                System.out.println("Имя: " + Shu_Names_Female[shu_names_female_choice - 1]);
            }
            int shu_surnames_size = 12;
            String [] Shu_Surnames = {"Вань","Као","Кунг","Лао","Линг","Мей","Пинь","Сум","Тань","Хуан","Чиень","Шин"};
            int shu_surnames_choice = (rand.nextInt(shu_surnames_size) + 1);
            System.out.println("Фамилия: " + Shu_Surnames[shu_surnames_choice - 1]);
        }
    }
}
class Dragonborn //+++++++++++++++++++++++=-> класс Драконорожденный <-=++++++++++++++++++++++++++++++++++++++++++++++++
{
    static void Name_Person(String gender)
    {
        Random rand = new Random ();
        if (gender == "Мужской")
        {
            int dragonborn_male_size = 17;
            String [] Dragonborn_Names_Male = {"Арджхан","Баласар","Бхараш","Гхеш","Донаар","Крив","Медраш","Мехен",
                    "Надарр","Панджед","Патрин","Рхогар","Тархун","Торинн","Хескан","Шамаш","Шединн"};
            int dragonborn_male_choice = (rand.nextInt(dragonborn_male_size) + 1);
            System.out.println("Имя: " + Dragonborn_Names_Male[dragonborn_male_choice - 1]);
        }
        else
        {
            int dragonborn_female_size = 17;
            String [] Dragonborn_Names_Female = {"Акра","Бири","Даар","Джхери","Кава","Коринн","Мисханн","Нала","Перра",
                    "Райанн","Сора","Сурина","Тхава","Уаджит","Фаридэ","Хавилар","Харанн"};
            int dragonborn_female_choice = (rand.nextInt(dragonborn_female_size) + 1);
            System.out.println("Имя: " + Dragonborn_Names_Female[dragonborn_female_choice - 1]);
        }
        int dragonborn_clans_size = 18;
        String [] Dragonborn_Clans = {"Версисатургиеш","Даардендриан","Делмирев","Драчедандион","Кепешкмолик","Керрилон",
                "Кимбатуул","Клестинсиаллор","Линксакасендалор","Мястан","Неммонис","Нориксиус","Офиншталажир","Прексижандилин",
                "Турнурот","Фенкенкаьрадон","Шестенделиат","Яржерит"};
        int dragonborn_clans_choice = (rand.nextInt(dragonborn_clans_size) + 1);
        System.out.println("Клан: " + Dragonborn_Clans[dragonborn_clans_choice - 1]);
    }
}
class Gnome //++++++++++++++++++++++++++++=-> класс Гном <-=++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
{
    static void Name_person(String gender)
    {
        Random rand = new Random();
        if (gender == "Мужской")
        {
            int gnome_male_size = 23;
            String [] Gnome_Names_Male = {"Алвин","Алстон","Боддинок","Брок","Бюргел","Варрин","Вренн","Гербо","Гимбл",
                    "Глим","Джебеддо","Димбл","Зук","Келлен","Намфудл","Оррин","Рундар","Сибо","Синдри","Фонкин","Фрюг",
                    "Элдон","Эрки"};
            int gnome_male_choice = (rand.nextInt(gnome_male_size) + 1);
            System.out.println("Имя: " + Gnome_Names_Male[gnome_male_choice - 1]);
        }
        else
        {
            int gnome_female_size = 22;
            String [] Gnome_Names_Female = {"Бимпноттин","Брина","Вейуокет","Донелла","Дувамил","Занна","Карамип","Карлин",
                    "Лилли","Лорилла","Лупмоттин","Маднаб","Никс","Нисса","Ода","Орла","Ройвин","Тана","Шамил","Эливик",
                    "Элиджобелл","Элла"};
            int gnome_female_choice = (rand.nextInt(gnome_female_size) + 1);
            System.out.println("Имя: " + Gnome_Names_Female[gnome_female_choice - 1]);
        }
        int gnome_clans_size = 11;
        String [] Gnome_Clans = {"Берен","Гаррик","Даергел","Мёрнинг","Накл","Нингел","Раулнор","Тимберс","Турен","Фолькор",
                "Шеппен"};
        int gnome_clans_choice = (rand.nextInt(gnome_clans_size) + 1);
        System.out.println("Клан: " + Gnome_Clans[gnome_clans_choice - 1]);
        int gnome_nicknames_size = 13;
        String [] Gnome_Nicknames = {"Барсук","Босоног","Двазамок","Колотушка","Ку","Ним","Пеплосерд","Пивохлёб","Плащ","Пок",
                "Самоцвет","Стамлдак","Фниппер"};
        int gnome_nicknames_choice = (rand.nextInt(gnome_nicknames_size) + 1);
        System.out.println("Прозвище: " + Gnome_Nicknames[gnome_nicknames_choice - 1]);
    }
}
class HalfElf //++++++++++++++++++++++++++=-> класс Полуэльф <-=++++++++++++++++++++++++++++++++++++++++++++++++++++++++
{
    // Данный класс использует имена класса "Человек" или имена класса "Эльф". В зависимости от работы Random.
}
class HalfOrk //++++++++++++++++++++++++++=-> класс Полуорк <-=+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
{
    static void Name_Person (String gender)
    {
        Random rand = new Random();
        if (gender == "Мужской")
        {
            int half_ork_male_size = 12;
            String [] HalfOrk_Names_Male = {"Гел","Денч","Имш","Кет","Краск","Муррен","Ронт","Токк","Фенг","Хенк","Холг","Шамп"};
            int half_ork_male_choice = (rand.nextInt(half_ork_male_size) + 1);
            System.out.println("Имя: " + HalfOrk_Names_Male[half_ork_male_choice - 1]);
        }
        else
        {
            int half_ork_female_size = 13;
            String [] HalfOrk_Names_Female = {"Багги","Вола","Волен","Евельда","Кансиф","Мев","Нига","Овак","Оунка","Сута",
                    "Шаута","Эмен","Энгонг"};
            int half_ork_female_choice = (rand.nextInt(half_ork_female_size) + 1);
            System.out.println("Имя: " + HalfOrk_Names_Female[half_ork_female_choice - 1]);
        }
    }
}
class Tifling
{
    static void Name_Percon (String gender)
    {
        Random rand = new Random();
        if (gender == "Мужской")
        {
            int tifling_male_size = 14;
            String [] Tifling_Names_Male = {"Акменос","Амнон","Баракас","Дамакос","Йадос","Кайрос","Люцис","Мелех","Мордай",
                    "Мортос","Пелайос","Скамос","Терай","Экемон"};
            int tifling_male_choice = (rand.nextInt(tifling_male_size) + 1);
            System.out.println("Инфернальное имя: " + Tifling_Names_Male[tifling_male_choice - 1]);
        }
        else
        {
            int tifling_female_size = 13;
            String [] Tifling_Names_Female = {"Акта","Анакис","Брисеис","Дамая","Каллиста","Криелла","Лерисса","Макария","Немея",
                    "Орианна","Риета","Фелая","Эа"};
            int tifling_female_choice = (rand.nextInt(tifling_female_size) + 1);
            System.out.println("Инфернальное имя: " + Tifling_Names_Female[tifling_female_choice - 1]);
        }
        int necrotic_names_size = 21;
        String [] Necrotic_Names = {"Безрассудство","Вера","Идеал","Искусство","Музыка","Мука","Надежда","Напев","Нигде","Открытость",
                "Отчаяние","Падаль","Поиск","Почтение","Поэзия","Превосходство","Скорбь","Слава","Случайность","Страх","Усталость"};
        int necrotic_names_choice = (rand.nextInt(necrotic_names_size) + 1);
        System.out.println("'Идейное' имя: " + Necrotic_Names[necrotic_names_choice - 1]);
    }
}
//----------------------------------  MAIN  ----------------------------------------------------------------------------
public class main
{
    static void Character(int gender, int race, int clas)
    {
        String gend = " ";
        Create_Unit unit = new Create_Unit();
        if (gender == 1)
            gend = "Мужской";
        else
            gend = "Женский";
        System.out.println("\nВаш новый персонаж: \nРаса: " + unit.Unit_Race(race));
        switch (race)
        {
            case 1:
                Dwarf dwarf_unit = new Dwarf();
                dwarf_unit.Discription_Dwarf();
                dwarf_unit.Name_Person(gend);
                break;
            case 2:
                Elf elf_unit = new Elf();
                elf_unit.Name_Person(gend);
                break;
            case 3:
                Halfling hulfling_unit = new Halfling();
                hulfling_unit.Name_Person(gend);
                break;
            case 4:
                Human human_unit = new Human();
                human_unit.Name_Person(gend);
                break;
            case 5:
                Dragonborn dragonborn_unit = new Dragonborn();
                dragonborn_unit.Name_Person(gend);
                break;
            case 6:
                Gnome gnome_unit = new Gnome();
                gnome_unit.Name_person(gend);
                break;
            case 7:
                Random rand = new Random();
                int half_elf_choice = (rand.nextInt(2) + 1);
                if (half_elf_choice == 1)
                {
                    Human half_elf_unit = new Human();
                    half_elf_unit.Name_Person(gend);
                    break;
                }
                else
                {
                    Elf half_elf_unit = new Elf();
                    half_elf_unit.Name_Person(gend);
                    break;
                }
            case 8:
                HalfOrk hulfOrk_unit = new HalfOrk();
                hulfOrk_unit.Name_Person(gend);
                break;
            case 9:
                Tifling tifling_unit = new Tifling();
                tifling_unit.Name_Percon(gend);
                break;
        }
        System.out.println("Пол: " + unit.Unit_Gender(gender));
        System.out.println("Класс: " + unit.Unit_Class(clas));
    }
    public static void main (String [] args) throws InterruptedException
    {
        int count = 1,  race = 0, clas = 0, gender = 0;
        while (count > 0)// цикл, который в случае ввода недопустимого знаения, возвращает первые вопросы.
        {
            System.out.println("\u001B[36m" + "Добро пожаловать в программу генерирования персонажа, для игры в D&D.");
            System.out.print("Выберете режим создания вашего персонажа: \n1 - Автоматический. \n2 - Полуавтоматический. \n--> " + "\u001B[0m");
            Scanner key = new Scanner(System.in);
            int mode = key.nextInt();
            /*char [] error = {'0','3','4','5','6','7','8','9','A','a','B','b','C','c','D','d','E','e','F','f','G','g','J','j',
                    'K','k','L','l','M','m','N','n','O','o','P','p','Q','q','R','r','S','s','T','t','U','u','V','v','W','W',
                    'X','x','Y','y','Z','z'};
            for (int i = 0; i < 66; i++)
            {
                if (mode == error[i])
                {
                    System.out.println("\u001B[31m\n" + "Ошибка! Введите пожалуйста корректные значения.\n" + "\u001B[0m");
                    break;
                }
                else
                {*/
                    if (mode == 1)
                    {
                        System.out.println("\u001B[33m\n" + "--> Вы выбрали автоматический режим создания персонажа." + "\u001B[0m");
                        count = 0;
                    }
                    else if (mode == 2)
                    {
                        System.out.println("\u001B[33m\n" + "--> Вы выбрали ручной режим создания персонажа." + "\u001B[0m");
                        count = (-1);
                    }
                    else
                        System.out.println("\u001B[31m\n" + "Ошибка! Введите пожалуйста корректные значения.\n" + "\u001B[0m");
                }
           // }
       // }
//+++++++++++++++++++++++++=-> автоматическое создание основы пресонажа <-=+++++++++++++++++++++++++++++++++++++++++++++
        if (count == 0)
        {
//+++++++++++++++++++++++++=-> визуальное отображение "размышлений" компьютера при автоматическом создании персонажа.+++
            System.out.print("Идёт создание персонажа:");
            Random rand = new Random();
            int pixel = (rand.nextInt(6) + 3);
            for (int i = 0; i < pixel; i++)
            {
                System.out.print(".");
                Thread.sleep(1000);
            }
//----------------------------------------------------------------------------------------------------------------------
            int rand_gender = (rand.nextInt(2) + 1);
            int rand_race = (rand.nextInt(9) + 1);
            int rand_clas = (rand.nextInt(12) + 1);

            Character(rand_gender, rand_race, rand_clas);
        }
//+++++++++++++++++++++++++=-> полностью ручное создание пресонажа <-=++++++++++++++++++++++++++++++++++++++++++++++++++
        else
        {
            System.out.print("Выберите пол персонажа: \n1. Мужской \n2. Женский \n--> ");
            Scanner key_1 = new Scanner(System.in);
            gender = key_1.nextInt();

            System.out.print("Выберете расу: ");
            System.out.print("\n1. Дварф\n2. Эльф\n3. Полурослик\n4. Человек\n5. Драконорожденный\n6. Гном\n7. Полуэльф \n8. Полуорк\n9. Тифлинг \n--> ");
            Scanner key_2 = new Scanner(System.in);
            race = key_2.nextInt();

            System.out.print("Выберете класс: ");
            System.out.print("\n1. Варвар\n2. Бард\n3. Жрец\n4. Друид\n5. Воин\n6. Монах\n7. Паладин\n8. Следопыт \n9. Плут\n10. Чародей\n11. Колдун\n12." +
                            "Волшебник\n--> ");
            Scanner key_3 = new Scanner(System.in);
            clas = key_3.nextInt();

            Character(gender, race, clas);
        }
    }
}