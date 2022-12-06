package Task2_Post;


public class Main {
        String PostSize = "900x600 px";
        int DayPost = 8;
        String month = "Ноябрь";
        int year = 2017;
        int likes = 71;
        int shares = 7;
        int comments = 476;
        String nameGroup = "Группы на Одноклассниках";
        String text = "Text template";
        int idPost = 9854281;


        //поскольку остальные параметры являются действиями, я решила записать их с помощью метода

        public String deletePost(){
                return "Удалить пост";
        }

        public String toComment (){
                return "Введите комментарий";
        }

        public String toShare (){
                return "Поделиться с друзьями";
        }

        public String like (){
                return "Нравится";
        }

        public String promote (){
                return "Продвигать";
    }

    }

