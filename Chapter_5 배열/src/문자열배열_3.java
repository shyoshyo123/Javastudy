import java .util.Scanner;
public class 문자열배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title={
        		"That That (Prod. & Feat. SUGA of BTS)",
        		"봄여름가을겨울 (Still Life)",
        		"TOMBOY",
        		"LOVE DIVE",
        		"사랑인가 봐",
        		"Feel My Rhythm",
        		"사랑은 늘 도망가",
        		"GANADARA (Feat. 아이유)",
        		"LOVE me",
        		"취중고백",
        		"우리들의 블루스",
        		"ZOOM",
        		"다정히 내 이름을 부르면",
        		"다시 만날 수 있을까",
        		"나의 X에게",
        		"신호등",
        		"Celeb",
        		"듣고 싶을까",
        		"이제 나만 믿어요",
        		"INVU",
        		"ELEVEN",
        		"Stay",
        		"무지개",
        		"strawberry moon",
        		"MY BAG",
        		"라일락",
        		"아버지",
        		"A bientot",
        		"감동이야 (Feat. 성시경)",
        		"Celebrity",
        		"너의 모든 순간",
        		"손이 참 곱던 그대",
        		"19금 abcdefu",
        		"회전목마 (Feat. Zion.T & 원슈타인) (Prod. by Slom)",
        		"사랑해 진짜",
        		"사랑역",
        		"Stronger (What Doesn't Kill You)",
        		"연애편지",
        		"FEARLESS",
        		"보금자리",
        		"정이라고 하자 (Feat. 10CM)",
        		"Next Level",
        		"너를 생각해",
        		"리무진 (Feat. MINO) (Prod. by GRAY)",
        		"언제나 사랑해",
        		"사랑해요 그대를",
        		"인생찬가",
        		"Bad Habits",
        		"Weekend",
        		"Butter",
        		"스물다섯, 스물하나",
        		"OHAYO MY NIGHT",
        		"바라만 본다",
        		"Dynamite",
        		"Counting Stars (Feat. Beenzino)",
        		"호랑수월가",
        		"내 손을 잡아",
        		"어제처럼",
        		"흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야",
        		"Seoul",
        		"문득",
        		"초록을거머쥔우리는",
        		"Tiny Riot",
        		"SMILEY (Feat. BIBI)",
        		"That's Hilarious",
        		"2002",
        		"Timeless",
        		"찰나가 영원이 될 때 (The Eternal Moment)",
        		"서랍",
        		"My Universe",
        		"모든 날, 모든 순간 (Every day, Every Moment)",
        		"Permission to Dance",
        		"고백",
        		"RUN2U",
        		"오래된 노래",
        		"밤하늘의 별을 (2020)",
        		"낙하 (With 아이유)",
        		"내가 아니라도",
        		"Blueming",
        		"드라마",
        		"오늘도 빛나는 너에게 (To You My Light) (Feat.이라온)",
        		"Loving You Girl (Feat. Hkeem)",
        		"나는 트로트가 싫어요",
        		"With you",
        		"밤이 깊었네 (Feat. 헤이즈)",
        		"헤픈 우연",
        		"눈이 오잖아 (Feat. 헤이즈)",
        		"Dun Dun Dance",
        		"Step Back",
        		"At My Worst",
        		"작은 것들을 위한 시 (Boy With Luv) (Feat. Halsey)",
        		"만남은 쉽고 이별은 어려워 (Feat. Leellamarz) (Prod. by TOIL)",
        		"Because Of You",
        		"Savage",
        		"Off My Face",
        		"봄 to 러브",
        		"이제는 (Feat. 화사)",
        		"선물",
        		"사이렌 Remix (Feat. UNEDUCATED KID & Paul Blanco)",
        		"롤린 (Rollin')",
        		"Every Second",
        		"존재만으로",
        		"에잇 (Prod. & Feat. SUGA of BTS)",
        		"아무래도 난",
        		"12 : 45 (Stripped)",
        		"여행",
        		"Hey Mama (Feat. Nicki Minaj & Bebe Rexha & Afrojack)",
        		"겨울잠",
        		"19금 Peaches (Feat. Daniel Caesar & Giveon)",
        		"Real Love",
        		"밝게 빛나는 별이 되어 비춰줄게",
        		"어떻게 이별까지 사랑하겠어, 널 사랑하는 거지",
        		"아로하",
        		"너의 번호를 누르고 (Prod. by 영화처럼)",
        		"비와 당신",
        		"초대",
        		"그게 더 편할 것 같아 (N번째 연애 X 멜로망스)",
        		"추억은 만남보다 이별에 남아",
        		"Savage Love (Laxed - Siren Beat) (BTS Remix)",
        		"내 곁에",
        		"봄날",
        		"Bad",
        		"사랑하게 될 줄 알았어",
        		"Starlight",
        		"우리가 헤어져야 했던 이유",
        		"Dance Monkey",
        		"Memories",
        		"Dreams Come True",
        		"주저하는 연인들을 위해",
        		"나보다 더 사랑해요",
        		"parachute",
        		"만개 (Prod. 신지후)",
        		"METEOR",
        		"어땠을까 (Feat. 박정현)",
        		"그래서 그래 (Feat. 윤하)",
        		"취기를 빌려 (취향저격 그녀 X 산들)",
        		"Way Back Home",
        		"흰눈",
        		"여름가을겨울 봄.",
        		"비가 오는 날엔 (2021)",
        		"너, 너 (N번째 연애 X 휘인 (Whee In))",
        		"잊을 수 있을까",
        		"운전만해 (We Ride)",
        		"Shape Of You",
        		"첫눈처럼 너에게 가겠다",
        		"어떻게 지내 (Prod. by VAN.C)",
        		"우연히 봄",
        		"늦은 밤 너의 집 앞 골목길에서",
        		"Wake Up (Prod. by 코드 쿤스트)",
        		"Kiss Me More (Feat. SZA)",
        		"Lovesick Girls",
        		"밤편지",
        		"그날에 나는 맘이 편했을까",
        		"Light Switch",
        		"마음을 드려요",
        		"마지막 너의 인사",
        		"Rainy day (Feat. ASH ISLAND & Skinny Brown)",
        		"시간을 거슬러 (낮에 뜨는 달 X 케이윌)",
        		"너의 번호를 누르고",
        		"쉬어 (Feat. MINO) (Prod. by GRAY)",
        		"안녕",
        		"GANJI (Feat. Jessi)",
        		"Can't Control Myself",
        		"Ashes",
        		"어푸 (Ah puh)",
        		"시작",
        		"희재",
        		"멜로디",
        		"Good Boy Gone Bad",
        		"레이디버드",
        		"슬픔이여안녕",
        		"사랑인가 봐 (Acoustic Ver.)",
        		"벚꽃이 피면 우리 그만 헤어져",
        		"Paris In The Rain",
        		"좋아좋아",
        		"있잖아",
        		"기억해 줘요",
        		"LOVE",
        		"잠이 오질 않네요",
        		"고맙소",
        		"Christmas Tree",
        		"사실 나는 (Feat. 전건호)",
        		"MILLIONS",
        		"9INTRO",
        		"노래 (The Song)",
        		"살았소",
        		"다시 사랑한다면 (김필 Ver.)",
        		"Don't Start Now",
        		"네가 없는 밤 (Feat. ASH ISLAND) (Prod. by GRAY)",
        		"Whisky on the Rock",
        		"DAYDREAM",
        		"All For You",
        		"우산이 없어요",
        		"살짝 설렜어 (Nonstop)",
        		"상상더하기",
        		"Leave The Door Open",
        		"Forever Young",
        		"선물 (Feat. 은지원)",
        		"하루만 더",
        		"Circles"
        };
        String[] singer={
        		"싸이 (Psy)",
        		"BIGBANG (빅뱅)",
        		"(여자)아이들",
        		"IVE (아이브)",
        		"멜로망스 (MeloMance)",
        		"Red Velvet (레드벨벳)",
        		"임영웅",
        		"박재범",
        		"BE'O (비오)",
        		"김민석 (멜로망스)",
        		"임영웅",
        		"제시",
        		"경서예지 & 전건호",
        		"임영웅",
        		"경서",
        		"이무진",
        		"싸이 (Psy)",
        		"MSG워너비 (M.O.M)",
        		"임영웅",
        		"태연 (TAEYEON)",
        		"IVE (아이브)",
        		"The Kid LAROI & Justin Bieber",
        		"임영웅",
        		"아이유 (IU)",
        		"(여자)아이들",
        		"아이유 (IU)",
        		"임영웅",
        		"임영웅",
        		"싸이 (Psy)",
        		"아이유 (IU)",
        		"성시경",
        		"임영웅",
        		"GAYLE",
        		"sokodomo",
        		"임영웅",
        		"임영웅",
        		"Kelly Clarkson",
        		"임영웅",
        		"LE SSERAFIM (르세라핌)",
        		"임영웅",
        		"BIG Naughty (서동현)",
        		"aespa",
        		"주시크 (Joosiq)",
        		"BE'O (비오)",
        		"케이시 (Kassy)",
        		"임영웅",
        		"임영웅",
        		"Ed Sheeran",
        		"태연 (TAEYEON)",
        		"방탄소년단",
        		"자우림",
        		"디핵 (D-Hack) & PATEKO",
        		"MSG워너비 (M.O.M)",
        		"방탄소년단",
        		"BE'O (비오)",
        		"탑현",
        		"아이유 (IU)",
        		"폴킴",
        		"장범준",
        		"볼빨간사춘기",
        		"BE'O (비오)",
        		"잔나비",
        		"Sam Ryder",
        		"YENA (최예나)",
        		"Charlie Puth",
        		"Anne-Marie",
        		"SG워너비",
        		"마크툽 (Maktub)",
        		"10CM",
        		"Coldplay & 방탄소년단",
        		"폴킴",
        		"방탄소년단",
        		"멜로망스 (MeloMance)",
        		"STAYC (스테이씨)",
        		"Standing Egg (스탠딩 에그)",
        		"경서",
        		"AKMU (악뮤)",
        		"주호",
        		"아이유 (IU)",
        		"아이유 (IU)",
        		"마크툽 (Maktub)",
        		"Peder Elias",
        		"임창정",
        		"지민 & 하성운",
        		"싸이 (Psy)",
        		"헤이즈 (Heize)",
        		"이무진",
        		"오마이걸 (OH MY GIRL)",
        		"GOT the beat",
        		"Pink Sweat$",
        		"방탄소년단",
        		"베이식 (Basick)",
        		"Ne-Yo",
        		"aespa",
        		"Justin Bieber",
        		"10CM",
        		"싸이 (Psy)",
        		"멜로망스 (MeloMance)",
        		"호미들",
        		"브레이브걸스 (Brave girls)",
        		"Mina Okabe",
        		"원슈타인",
        		"아이유 (IU)",
        		"주시크 (Joosiq)",
        		"etham",
        		"볼빨간사춘기",
        		"David Guetta",
        		"아이유 (IU)",
        		"Justin Bieber",
        		"오마이걸 (OH MY GIRL)",
        		"송이한",
        		"AKMU (악뮤)",
        		"조정석",
        		"#안녕",
        		"이무진",
        		"멜로망스 (MeloMance)",
        		"멜로망스 (MeloMance)",
        		"정동하",
        		"Jawsh 685 & Jason Derulo & 방탄소년단",
        		"태연 (TAEYEON)",
        		"방탄소년단",
        		"Christopher",
        		"전미도",
        		"태일 (TAEIL)",
        		"비비 (BIBI)",
        		"Tones And I",
        		"Maroon 5",
        		"aespa",
        		"잔나비",
        		"김호중",
        		"John K",
        		"김호중",
        		"창모 (CHANGMO)",
        		"싸이 (Psy)",
        		"에픽하이 (EPIK HIGH)",
        		"산들",
        		"숀 (SHAUN)",
        		"먼데이 키즈 (Monday Kiz)",
        		"잔나비",
        		"헤이즈 (Heize)",
        		"휘인 (Whee In)",
        		"노을",
        		"브레이브걸스 (Brave girls)",
        		"Ed Sheeran",
        		"에일리 (Ailee)",
        		"오반",
        		"로꼬 & 유주 (YUJU)",
        		"노을",
        		"개코 & 아우릴고트 (OUREALGOAT) & SINCE & 안병웅 & Tabber & 조광일",
        		"Doja Cat",
        		"BLACKPINK",
        		"아이유 (IU)",
        		"이예준",
        		"Charlie Puth",
        		"아이유 (IU)",
        		"헤이즈 (Heize)",
        		"PATEKO (파테코)",
        		"케이윌 (K.Will)",
        		"김나영",
        		"아넌딜라이트 (Anandelight) & Unofficialboyy & BE'O (비오) & 지구인 & Mudd The Student",
        		"폴킴",
        		"싸이 (Psy)",
        		"태연 (TAEYEON)",
        		"Stellar",
        		"아이유 (IU)",
        		"가호 (Gaho)",
        		"성시경",
        		"ASH ISLAND",
        		"투모로우바이투게더",
        		"잔나비",
        		"잔나비",
        		"김세정",
        		"벤",
        		"Lauv",
        		"조정석",
        		"폴킴",
        		"다비치",
        		"몬스타엑스",
        		"장범준",
        		"김호중",
        		"V",
        		"경서예지",
        		"WINNER",
        		"싸이 (Psy)",
        		"비투비",
        		"김호중",
        		"임영웅",
        		"Dua Lipa",
        		"BE'O (비오)",
        		"김연지",
        		"하이라이트 (Highlight)",
        		"서인국 & 정은지",
        		"김호중",
        		"오마이걸 (OH MY GIRL)",
        		"라붐 (LABOUM)",
        		"Bruno Mars & Anderson .Paak & Silk Sonic",
        		"BLACKPINK",
        		"케이윌 (K.Will)",
        		"빅마마 (Big Mama)",
        		"Post Malone"
        };
        
        String[] album={
        		"싸다9",
        		"봄여름가을겨울 (Still Life)",
        		"I NEVER DIE",
        		"LOVE DIVE",
        		"사랑인가 봐 (사내맞선 OST 스페셜 트랙)",
        		"'The ReVe Festival 2022 - Feel My Rhythm'",
        		"신사와 아가씨 OST Part.2",
        		"GANADARA",
        		"LOVE me",
        		"취중고백",
        		"IM HERO",
        		"ZOOM",
        		"다정히 내 이름을 부르면 (경서예지 x 전건호)",
        		"IM HERO",
        		"나의 X에게",
        		"신호등",
        		"싸다9",
        		"듣고 싶을까",
        		"내일은 미스터트롯 우승자 특전곡",
        		"INVU - The 3rd Album",
        		"ELEVEN",
        		"Stay",
        		"IM HERO",
        		"strawberry moon",
        		"I NEVER DIE",
        		"IU 5th Album 'LILAC'",
        		"IM HERO",
        		"IM HERO",
        		"싸다9",
        		"IU 5th Album 'LILAC'",
        		"별에서 온 그대 OST Part.7 (SBS 수목드라마)",
        		"IM HERO",
        		"abcdefu",
        		"쇼미더머니 10 Episode 2",
        		"IM HERO",
        		"IM HERO",
        		"Stronger (What Doesn't Kill You)",
        		"IM HERO",
        		"FEARLESS",
        		"IM HERO",
        		"정이라고 하자",
        		"Next Level",
        		"너를 생각해",
        		"쇼미더머니 10 Episode 3",
        		"조영수 리메이크 프로젝트 Part.2",
        		"IM HERO",
        		"IM HERO",
        		"=",
        		"Weekend",
        		"Butter",
        		"Goodbye, grief.",
        		"OHAYO MY NIGHT",
        		"MSG워너비 1집",
        		"Dynamite (DayTime Ver.)",
        		"Counting Stars",
        		"호랑수월가",
        		"최고의 사랑 OST Part.4 (MBC 수목드라마)",
        		"어제처럼",
        		"멜로가 체질 OST Part 3 (JTBC 금토 드라마)",
        		"Seoul",
        		"Bipolar",
        		"잔나비 소곡집 ll : 초록을거머쥔우리는",
        		"The Sun's Gonna Rise",
        		"ˣ‿ˣ (SMiLEY)",
        		"That's Hilarious",
        		"Speak Your Mind (Deluxe)",
        		"Wanna Be＋",
        		"Red Moon : Beyond The Light",
        		"그 해 우리는 OST Part.1",
        		"My Universe",
        		"'키스 먼저 할까요?' OST Part. 3 (SBS 월화드라마)",
        		"Butter / Permission to Dance",
        		"세 번째 '고백'",
        		"YOUNG-LUV.COM",
        		"오래된 노래",
        		"밤하늘의 별을 (2020)",
        		"NEXT EPISODE",
        		"내가 아니라도",
        		"Love poem",
        		"조각집",
        		"Red Moon : To You My Light",
        		"Love & Loneliness",
        		"별거 없던 그 하루로",
        		"우리들의 블루스 OST Part 4",
        		"싸다9",
        		"HAPPEN",
        		"눈이 오잖아",
        		"Dear OHMYGIRL",
        		"Step Back",
        		"The Prelude",
        		"MAP OF THE SOUL : PERSONA",
        		"쇼미더머니 10 Episode 3",
        		"Because Of You",
        		"Savage - The 1st Mini Album",
        		"Justice",
        		"우리들의 블루스 OST Part 3",
        		"싸다9",
        		"Moonlight",
        		"사이렌 Remix",
        		"Rollin'",
        		"Every Second",
        		"스물다섯 스물하나 OST Part 4",
        		"에잇",
        		"아무래도 난",
        		"12 : 45 (Stripped)",
        		"Red Diary Page.2",
        		"Listen (Deluxe)",
        		"조각집",
        		"Justice",
        		"Real Love",
        		"밝게 빛나는 별이 되어 비춰줄게",
        		"항해",
        		"슬기로운 의사생활 OST Part 3 (tvN 목요드라마)",
        		"너의 번호를 누르고",
        		"슬기로운 의사생활 시즌2 OST Part 1 (tvN 목요드라마)",
        		"초대",
        		"그게 더 편할 것 같아 (N번째 연애 X 멜로망스)",
        		"추억은 만남보다 이별에 남아",
        		"Savage Love (Laxed - Siren Beat) (BTS Remix)",
        		"우리들의 블루스 OST Part 6",
        		"YOU NEVER WALK ALONE",
        		"Under the Surface",
        		"슬기로운 의사생활 OST Part 11 (tvN 목요드라마)",
        		"스물다섯 스물하나 OST Part 1",
        		"그 해 우리는 OST Part.2",
        		"The Kids Are Coming",
        		"Memories",
        		"Dreams Come True - SM STATION",
        		"전설",
        		"나보다 더 사랑해요",
        		"love ＋ everything else",
        		"우리家",
        		"Boyhood",
        		"싸이6甲 Part.1",
        		"Epik High Is Here 下",
        		"취기를 빌려 (취향저격 그녀 X 산들)",
        		"Take",
        		"흰눈",
        		"잔나비 소곡집 ll : 초록을거머쥔우리는",
        		"비가 오는 날엔 (2021)",
        		"너, 너 (N번째 연애 X 휘인 (Whee In))",
        		"이별을 말하는",
        		"We Ride",
        		"÷ (Deluxe)",
        		"도깨비 OST Part 9 (tvN 금토드라마)",
        		"어떻게 지내",
        		"냄새를 보는 소녀 OST Part.2 (SBS 수목드라마)",
        		"늦은 밤 너의 집 앞 골목길에서",
        		"쇼미더머니 10 Episode 1",
        		"Kiss Me More",
        		"THE ALBUM",
        		"밤편지",
        		"그날에 나는 맘이 편했을까",
        		"That's Hilarious",
        		"사랑의 불시착 OST Part 11 (tvN 토일 드라마)",
        		"우리들의 블루스 OST Part 2",
        		"Rainy day",
        		"시간을 거슬러 (낮에 뜨는 달 X 케이윌)",
        		"너의 번호를 누르고",
        		"쇼미더머니 10 Episode 1",
        		"호텔 델루나 OST Part.10 (tvN 토일드라마)",
        		"싸다9",
        		"Can't Control Myself",
        		"Ashes",
        		"IU 5th Album 'LILAC'",
        		"이태원 클라쓰 OST Part.2 (JTBC 금토드라마)",
        		"국화꽃 향기 OST",
        		"멜로디",
        		"minisode 2 : Thursday's Child",
        		"잔나비 소곡집 ll : 초록을거머쥔우리는",
        		"잔나비 소곡집 ll : 초록을거머쥔우리는",
        		"사랑인가 봐 (사내맞선 OST Bonus Track)",
        		"벚꽃이 피면 우리 그만 헤어져",
        		"I met you when I was 18. (the playlist)",
        		"슬기로운 의사생활 시즌2 OST Part 5 (tvN 목요드라마)",
        		"연애플레이리스트2 OST Part.2",
        		"우리들의 블루스 OST Part 5",
        		"SHAPE of LOVE",
        		"잠이 오질 않네요",
        		"내일은 미스터트롯 결승전 베스트",
        		"그 해 우리는 OST Part.5",
        		"사실 나는",
        		"MILLIONS",
        		"싸다9",
        		"Be Together",
        		"살았소",
        		"사랑의 콜센타 PART56",
        		"Future Nostalgia",
        		"쇼미더머니 10 Final",
        		"우리들의 블루스 OST Part 1",
        		"DAYDREAM",
        		"응답하라 1997 Love Story Part 1 (tvN 화요드라마)",
        		"우리家",
        		"NONSTOP",
        		"Fresh Adventure",
        		"An Evening With Silk Sonic",
        		"SQUARE UP",
        		"선물",
        		"하루만 더",
        		"Hollywood's Bleeding"
        };
        ////////////////////////////////////////////// 데이터 저장
        Scanner sc=new Scanner(System.in);
        int curpage=1;
        int totalpage=(int)(Math.ceil(title.length/10.0));
        //ceil => 올림 함수
        //총개수 ==> 24 => 24/10 ==> 2+1 10 10 4
              //                 24/10.0 => 2.4 =>3  
        System.out.print("페이지 입력(1~"+ totalpage +"):");
        curpage=sc.nextInt();       
        System.out.println(curpage+"page/"+ totalpage+"pages");
        
        System.out.println("========"+curpage+"page========");
        System.out.println();
        int j=0; //10개씩 가져오는 변수
        int rowSize=10; //인덱스 시작위치 잡는 방법
        int pagecnt=(curpage*10)-10; //인덱스의 시작위치
        for(int i=0;i<title.length;i++)
        {
        	if(j<rowSize&& i>=pagecnt)//페이지 나누기
        	{
        		System.out.println((i+1)+"."+title[i]+"----"+singer[i]+"[+"+album[i]+"]");
        		j++;
        	}
        	
        	
        }
        
	}

}
