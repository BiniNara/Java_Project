package service;

import model.RestaurantDto;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDB {


    private ArrayList<RestaurantDto> restaurantDtos;

    public RestaurantDB() {
        makeList();
    }

    public List<RestaurantDto> makeList(){

        restaurantDtos = new ArrayList<>();

        restaurantDtos.add(new RestaurantDto("수림식당", "CHINESE", "중화요리", "051-808-8524",
                "부산 부산진구 부전동 66-12", "우육탕면, 탄탄면", "부산 부산진구 부전로66번길 12", "https://place.map.kakao.com/89199754",
                "2053098478","https://mblogthumb-phinf.pstatic.net/MjAxOTAxMjdfMjg2/MDAxNTQ4NTc3NTE3ODA3.jyQh1Fb1ZaDOve3moocv4hNA1KRZZ5xqVtm6VKc72bAg.dv325fcLyIGnIgE_Va8Sn2RKWG2Omr6QgMN4n-4zcr4g.JPEG.tjgmlek86/20190123123624_IMG_2498-01-01.jpeg?type=w800"));

        restaurantDtos.add(new RestaurantDto("홍콩반점0410 서면점", "CHINESE", "중화요리", "070-8818-0410",
                "부산 부산진구 부전동 175 ", "짜장면, 짬뽕", "부산 부산진구 중앙대로680번가길 38", "https://place.map.kakao.com/26538257",
                "2143988257","https://img.siksinhot.com/place/1605152744017465.PNG?w=307&h=300&c=Y"));

        restaurantDtos.add(new RestaurantDto("시더스초밥", "JAPANESE", "초밥", "051-805-7774",
                "부산 부산진구 부전동 19-1", "초밥, 모듬튀김", "부산 부산진구 서면문화로 7", "https://place.map.kakao.com/2060454105",
                "15204021","https://media-cdn.tripadvisor.com/media/photo-s/12/05/3d/a2/caption.jpg"));

        restaurantDtos.add(new RestaurantDto("나노갈매기 서면1호점", "KOREAN", "육류,고기", "051-808-0029",
                "부산 부산진구 부전동 13-5", "삼겹살, 목살, 가브리살", "부산 부산진구 서전로10번길 32", "https://place.map.kakao.com/13129076",
                "1619274444","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTbDQhKh4uMunnB4EE5kH6Lu1OF4YpRJywpA&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("부산댁", "KOREAN", "육류,고기", "051-808-0661",
                "부산 부산진구 부전동 180", "모듬한판, 항정살", "부산 부산진구 동천로107번길 14", "https://place.map.kakao.com/1705068258",
                "811272424","http://www.seoulwire.com/news/photo/201807/19120_14600_5630.jpg"));

        restaurantDtos.add(new RestaurantDto("롤링파스타", "WESTERN", "이탈리안", "051-804-8046",
                "부산 부산진구 부전동 5-5", "크림 수프 파스타, 매운 크림 파스타", "부산 부산진구 서전로10번길 60", "https://place.map.kakao.com/1727802721",
                "829236335","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0w6gPHp_Q-I-qQf0zEulEOUmG5KK6zRmygzgNGx7aR-lHlLi_V1QNQsZtgW2MomVo3vk&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("카츠와라", "JAPANESE", "돈까스", "051-804-5799",
                "부산 부산진구 부전동 7-15", "돈까스, 옛날 돈까스", "부산 부산진구 서면로68번길 42", "https://place.map.kakao.com/68296224",
                "24725107","https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/459460_1498928329342661.jpg"));

        restaurantDtos.add(new RestaurantDto("대림참치", "JAPANESE", "참치회", "051-802-7760",
                "부산 부산진구 부전동 11-13", "참치 회", "부산 부산진구 서면로 48-1", "https://place.map.kakao.com/16243380",
                "149543887","https://ssproxy.ucloudbiz.olleh.com/v1/AUTH_e59809eb-bdc9-44d7-9d8f-2e7f0e47ba91/post_card/67041_1592286979_uZtHVD65.jpg"));

        restaurantDtos.add(new RestaurantDto("옹헤야불백", "KOREAN", "육류,고기", "070-4175-0075",
                "부산 부산진구 부전동 11-11", "불백, 고추장 불백", "부산 부산진구 서전로 14", "https://place.map.kakao.com/30255959",
                "8696442","https://img.siksinhot.com/place/1508728090055419.jpg"));

        restaurantDtos.add(new RestaurantDto("맛있는삼시세끼", "KOREAN", "육류,고기", "0507-1389-8384",
                "부산 부산진구 부전동 43-13", "고기정식, 두루치기", "부산 부산진구 중앙대로692번길 45-6", "https://place.map.kakao.com/121680096",
                "735673283","https://mblogthumb-phinf.pstatic.net/MjAyMDA5MjNfMTYg/MDAxNjAwODMzNTI1NzIz.FBvpIkAm8uopIJL-kKCXt3Dg03RSBmurjJ2DEtXZxu8g.7Ugue12BSZdKVLD2X2K_OM7CypMwMHMGtn5A0Cf9Kb8g.JPEG.lin1210/IMG_9661.JPG?type=w800"));

        restaurantDtos.add(new RestaurantDto("고반식당", "KOREAN", "육류,고기", "051-808-2468",
                "부산 부산진구 부전동 43-15", "국내산 숙성 생삼겹살", "부산 부산진구 가야대로784번길 46-10", "https://place.map.kakao.com/1830294747",
                "650374759","https://cdn.imweb.me/thumbnail/20200513/480e99982a163.png"));

        restaurantDtos.add(new RestaurantDto("동해물회", "KOREAN", "물회", "051-737-5115",
                "부산 부산진구 부전동 263", "물회", "부산 부산진구 서전로 13", "https://place.map.kakao.com/9772721",
                "13272050","https://mblogthumb-phinf.pstatic.net/20160601_249/bbi_yu_1464745684610p3cSv_PNG/tyle.io-CRpDviQwP8k8sZEJM-1_%2814%29.png?type=w800"));

        restaurantDtos.add(new RestaurantDto("종로불돼지", "KOREAN", "쌈밥정식", "051-734-1190",
                "부산 부산진구 부전동 155", "쌈정식", "부산 부산진구 중앙대로 711", "https://place.map.kakao.com/8655423",
                "17278908","https://www.chadorri.com/wp-content/uploads/2013/08/20130812_127.jpg"));

        restaurantDtos.add(new RestaurantDto("도우개러지", "WESTERN", "이탈리안", "051-739-8208",
                "부산 부산진구 부전동 19-11", "스파게티, 화덕피자", "부산 부산진구 서전로46번길 8", "https://place.map.kakao.com/808624923",
                "18283622","https://media-cdn.tripadvisor.com/media/photo-s/1a/a9/94/45/caption.jpg"));

        restaurantDtos.add(new RestaurantDto("라마앤바바나", "ASIAN", "인도음식", "051-318-0094",
                "부산 부산진구 부전동 35-2", "커리, 탄두리", "부산 부산진구 중앙대로680번길 45-8", "https://place.map.kakao.com/18773207",
                "11834063","https://modo-phinf.pstatic.net/20181201_136/1543648648445496se_JPEG/mosazRWPN5.jpeg?type=a1100"));

        restaurantDtos.add(new RestaurantDto("마마된장", "KOREAN", "찌개전골", "051-2265-5744",
                "부산 부산진구 부전동 5-1", "우렁된장, 된장찌개", "부산 부산진구 서면로68번길 38", "https://place.map.kakao.com/26844991",
                "10374336","https://mblogthumb-phinf.pstatic.net/MjAxODA1MjlfMjcy/MDAxNTI3NTUyOTA0MTA2.5-hNYc39kEPiiyJqd_yws_bXucW8eutfvf4sqQwzQa0g.3ZzwYW4hl4ysIGA0hbMQ9cOmCcm5NdGDWfaEdbue0lUg.JPEG.sherinks/20180527_185701.jpg?type=w800"));

        restaurantDtos.add(new RestaurantDto("1984나폴리", "WESTERN", "피자", "051-795-3283",
                "부산 부산진구 부전동 42-4", "1984빠네, 나폴리피자", "부산 부산진구 전포대로209번길 17-6", "https://place.map.kakao.com/27220658",
                "1397192634","http://www.seoulwire.com/news/photo/201810/31169_25058_17.jpg"));

        restaurantDtos.add(new RestaurantDto("기장손칼국수", "KOREAN", "국수", "051-722-3149",
                "부산 부산진구 부전동 7-5", "손칼국수, 김밥", "부산 부산진구 서면로 56 서면시장", "https://place.map.kakao.com/11495457",
                "221545425","https://t1.daumcdn.net/cfile/tistory/994E93345BFF35F733"));

        restaurantDtos.add(new RestaurantDto("정을담다", "KOREAN", "보쌈정식", "051-735-6698",
                "부산 부산진구 부전동 12-23", "보쌈정식, 김치찌개", "부산 부산진구 중앙대로692번길 38", "https://place.map.kakao.com/23569126",
                "9631798","https://mblogthumb-phinf.pstatic.net/MjAxNzExMTlfMTUg/MDAxNTExMDIwMjk0NDQ1.KM9dSD3E9Y3CT_Kjn1tdeRsDi-pQ4v89YPQYurjOaecg.uQf8IItml3XGLaB6HTJ-TvV5KKb66-ZTVSgWZGKEc6wg.JPEG.h00000n/IMG_5015.JPG?type=w800"));

        restaurantDtos.add(new RestaurantDto("아임타이", "ASIAN", "태국음식", "051-725-1688",
                "부산 부산진구 부전동 43-7", "팟타이", "부산 부산진구 전포대로199번길 12", "https://place.map.kakao.com/1450575364",
                "208592301","https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/20180219014039886_photo0_087b3dd4c395.jpg"));

        restaurantDtos.add(new RestaurantDto("짚신매운갈비찜", "KOREAN", "육류고기", "051-725-9233",
                "부산 부산진구 부전동 11-13", "돼지갈비찜, 소갈비찜", "부산 부산진구 서전로10번길 34", "https://place.map.kakao.com/17606304",
                "1969790364","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROHOQfJlJmOFXw1OAa8ucN8z1Zso_jbUTaEw&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("철인7호", "KOREAN", "치킨", "051-722-9992",
                "부산 부산진구 부전동 44-1", "후라이드, 순살콤보", "부산 부산진구 서전로10번길 31-3", "https://place.map.kakao.com/23350363",
                "26884480","https://mblogthumb-phinf.pstatic.net/MjAxNzA1MTZfMzIg/MDAxNDk0OTIzNTY5NDMz.NuPqvJEoe-JDJO3B1bvyfE-eCeGsWots9uXkLkeGJc4g.-sQLWWJiCzzFWtCGJCYFnwQeoKRc6ML3rgP5ohQwVR8g.JPEG.22woom/KakaoTalk_20170516_172037615%EC%A2%85%EB%A1%9C%EB%A7%9B%EC%A7%91%EC%A2%85%EB%A1%9C%EB%AF%B8%EC%B9%9C%EB%8B%AD_%EC%A2%85%EA%B0%81%EB%A7%9B%EC%A7%91%EC%A2%85%EA%B0%81%EC%97%AD%EB%A7%9B%EC%A7%91_%EC%A2%85%EB%A1%9C%EC%B9%98%ED%82%A8%EC%A7%91_%EC%A2%85.jpg?type=w800"));

        restaurantDtos.add(new RestaurantDto("개미집", "KOREAN", "해물생선", "051-720-7991",
                "부산 부산진구 부전동 19-16", "낚지볶음", "부산 부산진구 신천대로62번길 73", "https://place.map.kakao.com/8738686",
                "8458646","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGfiQVRuEvdbUPddu28qWm4tCXql57VCcs7w&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("송정삼대국밥", "KOREAN", "국밥", "051-738-8588",
                "부산 부산진구 부전동 256", "돼지국밥, 순대국밥", "부산 부산진구 서면로68번길 33", "https://place.map.kakao.com/10551889",
                "27491757","https://t1.daumcdn.net/cfile/tistory/993DAF415E108D5C0A"));

        restaurantDtos.add(new RestaurantDto("고기굽는남자", "KOREAN", "육류고기", "051-732-8188",
                "부산 부산진구 부전동 14-1", "삼겹살, 목살", "부산 부산진구 동천로95번길 13", "https://place.map.kakao.com/26781763",
                "170372666","https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/707338_1492362614652656.jpg"));

        restaurantDtos.add(new RestaurantDto("일편등심", "KOREAN", "육류고기", "051-4104-9922",
                "부산 부산진구 부전동 180", "한우 눈꽃 등심, 안심", "부산 부산진구 서전로10번길 50", "http://place.map.kakao.com/916261841",
                "916261841","https://static.hubzum.zumst.com/hubzum/2020/11/12/09/06cfa004abc84093ab683f5ce7b5bd45.jpg"));

        restaurantDtos.add(new RestaurantDto("종로양꼬치", "CHINESE", "양꼬치", "051-720-8168",
                "부산 부산진구 부전동 13-7", "양모듬, 고급양갈비", "부산 부산진구 서전로10번길 50", "http://place.map.kakao.com/15864091",
                "15864091","http://cdn.ksilbo.co.kr/news/photo/201904/691501_364918_269.jpg"));

        restaurantDtos.add(new RestaurantDto("당산오돌", "KOREAN", "육류고기", "051-723-3590",
                "부산 부산진구 부전동 44-5", "꼬들살, 눈꽃갈비", "부산 부산진구 서전로10번길 50", "http://place.map.kakao.com/3678525",
                "3678525","https://emmaru.com/matzip/include/pics/2020/01/21/m_19852O213741_7.jpg"));

        restaurantDtos.add(new RestaurantDto("오로지라멘", "JAPANESE", "일본식라면", "051-733-9279",
                "부산 부산진구 부전동 13-2", "돈코츠라멘, 오로지라멘", "부산 부산진구 서전로10번길 50", "http://place.map.kakao.com/1414375847",
                "1414375847","https://t1.daumcdn.net/cfile/tistory/99EF96375CE16DF009"));

        restaurantDtos.add(new RestaurantDto("왕비집", "KOREAN", "육류고기", "051-720-3066",
                "부산 부산진구 부전동 12-11", "소갈비정식, 한우불고기정식", "부산 부산진구 서전로10번길 50", "http://place.map.kakao.com/15232887",
                "15232887","https://media-cdn.tripadvisor.com/media/photo-s/07/ff/ac/d7/caption.jpg"));

        restaurantDtos.add(new RestaurantDto("고메식당", "KOREAN", "육류고기", "051-723-0999",
                "부산 부산진구 부전동 43-5", "이베리코 돼지 꽃목살, 명품 숙성 삼겹살", "부산 부산진구 서전로10번길 50", "http://place.map.kakao.com/2131396403",
                "2131396403","https://mblogthumb-phinf.pstatic.net/MjAxNzA3MTdfMjA4/MDAxNTAwMjU4Mzk0OTE1.Zodr30xmueDpTJWHB8T6N_BYQdS4A_a8hCtDDvu_K0Qg.22FaJZp-zsGm1b4rj4J0MX9ZKqu9HZCVgcIOSoEmFKwg.JPEG.dieunjjang/image_955702301500258372498.jpg?type=w800"));

        restaurantDtos.add(new RestaurantDto("소소횟집", "KOREAN", "해물생선회", "051-733-1226",
                "부산 부산진구 부전동 11-1", "물회, 모듬회", "부산 부산진구 서전로10번길 50", "https://place.map.kakao.com/14707328",
                "7977978","https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/20211019104417_photo1_Nm0ULH5g8GOd.jpg"));

        restaurantDtos.add(new RestaurantDto("유해업소 서면점", "KOREAN", "육류,고기", "051-722-3852",
                "부산 부산진구 부전동 6-4", "숯불닭갈비, 양념닭갈비", "부산 부산진구 서전로10번길 50", "http://place.map.kakao.com/1750296031",
                "1750296031","https://mblogthumb-phinf.pstatic.net/MjAxOTA5MjhfMjIg/MDAxNTY5Njc3NTM5MTcx.WZ4M7VVgCSN_cgnzFLwJKOVpmPLHVn0Z4yaSOFHKWvUg.3Xy8rKF71HPWDM2QP_vRUlGeCVSUq92otg4AIOVy-1Qg.JPEG.7533004/%EC%B4%8C%EB%86%88%EC%88%AF%EB%B6%88%EB%8B%AD%EA%B0%88%EB%B9%84.jpg?type=w800"));

        restaurantDtos.add(new RestaurantDto("어쭈 서면점", "KOREAN", "해물생선", "051-732-8806",
                "부산 부산진구 부전동 175", "쭈꾸미 볶음, 물총칼국수", "부산 부산진구 서면로 26", "https://place.map.kakao.com/19926048",
                "26432860","https://mblogthumb-phinf.pstatic.net/MjAyMDAzMjRfMjAy/MDAxNTg1MDQ4NTEzNjEy.Ww2o2mUBjJzzvWV5k68NTNx3HXoUpN0e9dJ45nJpHLkg.vu4vF1hMhDENgJ6y8x5nUJeYFPzvCIc8MHUTn5vR5mYg.JPEG.noty9240/1585048513241.JPG?type=w800"));

        restaurantDtos.add(new RestaurantDto("후발대", "KOREAN", "곱창막창", "051-723-5157",
                "부산 부산진구 부전동 18-8", "곱창구이, 양라면", "부산 부산진구 부전로20번길 32-5", "https://place.map.kakao.com/12030410",
                "21396905","https://d2uja84sd90jmv.cloudfront.net/posts/LJ_IYGvldp6xqfk7mQhaKw/m.jpg"));

        restaurantDtos.add(new RestaurantDto("서면통통낙지", "KOREAN", "해물생선", "051-737-7880",
                "부산 부산진구 부전동 11-11", "낙곱새, 낙지볶음", "부산 부산진구 서전로9번길 36", "https://place.map.kakao.com/77052984",
                "27146280","https://t1.daumcdn.net/cfile/tistory/253EDF3F532338B30A"));

        return restaurantDtos;
    }

}
