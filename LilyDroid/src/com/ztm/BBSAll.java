package com.ztm;

import java.util.HashMap;

public class BBSAll {
	
	/**
	 * 得到更新信息
	 */
	public static String getUpdateInfo() {
	
		String update;
		
		
		update = "主要更新:\r\n1.长按主题可选择访问主题全文\r\n2.从十大或热点访问讨论区正确返回\r\n3.图片浏览功能强化\r\n4.解析主题效率提升\r\n5.版主的一般模式修正\r\n6.新邮件提示";
		return update;
	}
	
	/**
	 * 表情集合
	 * @return
	 */
	public static HashMap<String,Integer> getSmilyAll() {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("[:s]",  R.drawable.face2);
		hm.put("[:O]",  R.drawable.face0);
		hm.put("[:|]",  R.drawable.face3);
		hm.put("[:]", R.drawable.face6);
		hm.put("[:X]",  R.drawable.face7);
		
		hm.put("[:'(]", R.drawable.face9);
		hm.put("[:-|]", R.drawable.face10);
		hm.put("[:@]", R.drawable.face11);
		hm.put("[:P]", R.drawable.face12);
		hm.put("[:D]", R.drawable.face13);
		hm.put("[:)]", R.drawable.face14);
		hm.put("[:(]", R.drawable.face15);
		hm.put("[:Q]", R.drawable.face18);
		hm.put("[:T]", R.drawable.face19);
		
		hm.put("[;P]", R.drawable.face20);
		hm.put("[;-D]", R.drawable.face21);
		hm.put("[:!]", R.drawable.face26);
		hm.put("[:L]", R.drawable.face27);
		hm.put("[:?]", R.drawable.face32);
		hm.put("[:U]", R.drawable.face16);
		hm.put("[:K]", R.drawable.face25);
		hm.put("[;X]", R.drawable.face34);
		hm.put("[:H]", R.drawable.face36);
		
		hm.put("[;bye]", R.drawable.face39);
		hm.put("[;cool]", R.drawable.face4);
		hm.put("[:-b]", R.drawable.face40);
		hm.put("[:-8]", R.drawable.face41);
		hm.put("[;PT]", R.drawable.face42);
		hm.put("[:hx]", R.drawable.face44);
		hm.put("[;K]", R.drawable.face47);
		hm.put("[:E]", R.drawable.face49);
		hm.put("[:-(]", R.drawable.face50);
		hm.put("[:C-]", R.drawable.face29);
		
		hm.put("[;hx]", R.drawable.face51);
		hm.put("[:-v]", R.drawable.face53);
		hm.put("[;xx]", R.drawable.face54);
		return hm;
	}
	
	
	/**
	 * 颜色集合
	 * @return
	 */
	public static HashMap<String,String> getFColorAll() {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("[1;31m", "</font><font color=red >");
		hm.put("[1;32m", "</font><font color=green >");
		hm.put("[1;33m", "</font><font color=#808000 >");
		hm.put("[1;34m", "</font><font color=blue >");
		hm.put("[1;35m", "</font><font color=#D000D0 >");
		hm.put("[1;36m", "</font><font color=#33A0A0 >");
		hm.put("[32m", "</font><font color=#808000 >");
		hm.put("[33m", "</font><font color=green >");
		hm.put("[37;1m", "");
		hm.put("[m", "");
		
		
		
		
		
		
		return hm;
	}
	
	
	/**
	 * 版面集合
	 * @return
	 */
	public static HashMap<String,String> getBBSAll() {
		HashMap<String,String> hm = new HashMap<String,String>();

		hm.put("南京大屠杀", "1937_12_13");
		hm.put("第七艺术", "7th_Art");
		hm.put("飞越重洋", "Abroad");
		hm.put("学术讲座", "AcademicReport");
		hm.put("保险精算", "Actuary");
		hm.put("广告艺术", "AD_Art");
		hm.put("百合共创", "Advice");
		hm.put("宇航", "Aerospace");
		hm.put("代理", "Agent");
		hm.put("人工智能", "AI");
		hm.put("个人写真", "AlbumShow");
		hm.put("算法", "Algorithm");
		hm.put("美利坚之窗", "America");
		hm.put("淮水皖风", "AnHui");
		hm.put("站务公告栏", "Announce");
		hm.put("反腐倡廉", "AntiMalfeasant");
		hm.put("反谣言中心", "AntiRumor");
		hm.put("苹果电脑", "Apple");
		hm.put("古文观止", "Archaism");
		hm.put("考古", "Archeology");
		hm.put("ASCII艺术", "ASCIIArt");
		hm.put("社团联合会主席信箱", "Association_Union");
		hm.put("星月童话", "Astrology");
		hm.put("大气科学论坛", "AtmosphereSci");
		hm.put("车迷世界", "AutoSpeed");
		hm.put("羽毛球", "Badminton");
		hm.put("篮球", "Basketball");
		hm.put("BBS的安装与设置", "BBSDev");
		hm.put("新手求助", "BBSHelp");
		hm.put("本站的各类统计列表与记录", "bbslists");
		hm.put("首都北京", "BeiJing");
		hm.put("台球", "Billiards");
		hm.put("比特洪流", "BitTorrent");
		hm.put("温馨祝福", "Bless");
		hm.put("博客论坛", "Blog");
		hm.put("版主监督和管理", "BMManager");
		hm.put("南大战网游戏", "BNGames");
		hm.put("版主竞选与请辞", "Board");
		hm.put("桌面游戏", "BoardGame");
		hm.put("版面开设与变更", "BoardManage");
		hm.put("高矮胖瘦", "BodilyForm");
		hm.put("Borland世界", "Borland");
		hm.put("保龄球馆", "Bowling");
		hm.put("拳击与格斗", "Boxing_Fight");
		hm.put("男生世界", "Boys");
		hm.put("桥牌联谊会", "Bridge");
		hm.put("行走英伦", "Britain");
		hm.put("布袋戏", "Budaixi");
		hm.put("校务公告", "bulletin");
		hm.put("国际学院", "C_Inter");
		hm.put("中国书法", "Calligraphy");
		hm.put("中国科学院", "CAS");
		hm.put("中美中心", "CCAS");
		hm.put("礼仪中心", "CCP");
		hm.put("计算流体论坛", "CFD");
		hm.put("锦绣常州", "ChangZhou");
		hm.put("聊天版", "Chat");
		hm.put("化学版", "Chemistry");
		hm.put("象棋", "Chess");
		hm.put("中国足球", "ChinaFootball");
		hm.put("国内新闻", "ChinaNews");
		hm.put("声乐艺术爱好者（南大合唱团）", "Chorus");
		hm.put("理财", "Chrematistics");
		hm.put("基督教研究", "Christianity");
		hm.put("春秋战国", "ChunQiu_ZhanGuo");
		hm.put("公务员之家", "Civil_Servant");
		hm.put("古典诗词", "Classical_Poem");
		hm.put("古韵悠长", "ClassicalCulture");
		hm.put("古典音乐", "ClassicalMusic");
		hm.put("收藏爱好", "Collections");
		hm.put("动漫世界", "Comic");
		hm.put("投诉与举报", "Complain");
		hm.put("电脑菜鸟要学飞", "Computer_ABC");
		hm.put("咨询", "Consultant");
		hm.put("大学生竞赛", "Contest");
		hm.put("对联", "Couplet");
		hm.put("注册会计师", "CPA");
		hm.put("C++程序设计语言", "CPlusPlus");
		hm.put("中国药科大学", "CPU");
		hm.put("穿越海峡", "Cross_Strait");
		hm.put("十字绣坊", "CrossShow");
		hm.put("魔方", "Cube");
		hm.put("中国地质大学", "CUG");
		hm.put("中国矿业大学", "CUMT");
		hm.put("自行车运动", "Cycling");
		hm.put("中文系", "D_Chinese");
		hm.put("计算机系", "D_Computer");
		hm.put("地球科学与工程学院", "D_EarthScience");
		hm.put("电子科学与工程学院", "D_EE");
		hm.put("历史系", "D_History");
		hm.put("材料科学系", "D_Materials");
		hm.put("数学系", "D_Maths");
		hm.put("哲学系", "D_Philosophy");
		hm.put("物理学院", "D_Physics");
		hm.put("社会保障系", "D_SocialSec");
		hm.put("舞蹈天地", "Dance");
		hm.put("数据库系统", "Database");
		hm.put("辩者无敌", "Debate");
		hm.put("侦探推理", "Detective");
		hm.put("德文堂", "Deutsch");
		hm.put("数码音乐设备", "DigiMusic");
		hm.put("数码世界", "DigitalWorld");
		hm.put("匡亚明学院_强化部", "DII");
		hm.put("神秘之旅", "Discovery");
		hm.put("碟碟不休", "DiscZone");
		hm.put("白山黑水", "DongBei");
		hm.put("远古之守护", "DotaAllstars");
		hm.put(".net技术", "DotNet");
		hm.put("戏剧春秋", "Drama");
		hm.put("绘画艺术", "Drawing");
		hm.put("青春有梦", "Dream");
		hm.put("酒吧与咖啡馆", "Drink");
		hm.put("DV工作室", "DV_Studio");
		hm.put("电子商务特区", "E_Business");
		hm.put("电子竞技", "E_Sports");
		hm.put("地球科学", "EarthSciences");
		hm.put("经济学", "Economics");
		hm.put("教育论坛", "Education");
		hm.put("电子技术版", "EEtechnology");
		hm.put("电子音乐", "ElectronicMusic");
		hm.put("嵌入式系统", "Embedded");
		hm.put("武侠小说", "Emprise");
		hm.put("英语世界", "English");
		hm.put("英语聊天版", "EnglishCorner");
		hm.put("世说新语", "Esperanto");
		hm.put("时尚男生", "Esquire");
		hm.put("版务评优", "ExcellentBM");
		hm.put("交换生天地", "ExchangeStudent");
		hm.put("一级方程式赛车", "F1");
		hm.put("外国文学", "F_Literature");
		hm.put("七色花", "FairyTale");
		hm.put("家庭生活", "FamilyLife");
		hm.put("反哺学社", "FanBu");
		hm.put("奇幻天地", "Fantasy");
		hm.put("美丽流行风", "Fashion");
		hm.put("复旦大学", "FDU");
		hm.put("对外交流协会", "FEA");
		hm.put("感情世界", "Feelings");
		hm.put("科幻世界", "Fiction");
		hm.put("金融天下", "Finance");
		hm.put("碧波垂钓", "Fishing");
		hm.put("健美与健身", "Fitness");
		hm.put("闪客世界", "Flash");
		hm.put("跳蚤市场", "FleaMarket");
		hm.put("花草园艺", "Flowers");
		hm.put("民谣及乡村音乐", "Folk_Country");
		hm.put("国乐飘香（民乐团）", "Folk_Music");
		hm.put("雅舍谈吃", "FOOD");
		hm.put("Fortran语言", "Fortran");
		hm.put("百合论坛", "Forum");
		hm.put("浪漫法兰西", "French");
		hm.put("友情久久", "Friendship");
		hm.put("八闽畅怀", "FuJian");
		hm.put("天文爱好者协会", "GAFA");
		hm.put("研究生英语俱乐部", "GEC");
		hm.put("地理科学", "Geography");
		hm.put("女生天地", "Girls");
		hm.put("地理信息科学", "GIS");
		hm.put("够级艺术", "GJ");
		hm.put("高考招生信息", "GoToUniversity");
		hm.put("电脑图形处理", "Graphics");
		hm.put("GRE&TOEFL专题讨论", "GRE_TOEFL");
		hm.put("脑筋急转弯", "GreatTurn");
		hm.put("希腊罗马", "GreeceRome");
		hm.put("南大环境保护协会", "GreenEarth");
		hm.put("粤是故乡名", "GuangDong");
		hm.put("八桂大地", "GuangXi");
		hm.put("罪与罚", "Guilt");
		hm.put("吉它", "Guitar");
		hm.put("古琴社", "GuQin");
		hm.put("黑客的摇篮", "Hacker");
		hm.put("天涯海角", "HaiNan");
		hm.put("精致手工", "HandiCraft");
		hm.put("硬件工作室", "Hardware");
		hm.put("燕赵大地", "HeBei");
		hm.put("九州之中", "HeNan");
		hm.put("河海大学", "HHU");
		hm.put("发烧天堂", "HiFi");
		hm.put("历史", "History");
		hm.put("香港大学", "HKU");
		hm.put("游子情深", "Hometown");
		hm.put("同一片天空", "HomoSky");
		hm.put("战场", "HotZone");
		hm.put("高性能计算", "HPC");
		hm.put("淮水楚云", "HuaiAn");
		hm.put("荆楚大地", "HuBei");
		hm.put("人类漫谈", "Human");
		hm.put("三湘四水", "HuNan");
		hm.put("掀起你的盖头来", "ID");
		hm.put("清谈雅思", "IELTS");
		hm.put("美术研究院_雕塑艺术研究所", "IFA_IS");
		hm.put("海外教育学院", "IFIS");
		hm.put("图像世界", "Image");
		hm.put("信息管理技术", "Info_Manage");
		hm.put("塞外风情", "Inner_Mongolia");
		hm.put("实习", "Intern");
		hm.put("国际关系", "IR");
		hm.put("IT俱乐部", "ITClub");
		hm.put("IT认证考试", "ITExam");
		hm.put("和风艺影", "J_Ent");
		hm.put("日语学习", "Japanese");
		hm.put("Java语言", "Java");
		hm.put("爵士蓝调", "Jazz_Blues");
		hm.put("江南西道", "JiangXi");
		hm.put("吉林大学", "JLU");
		hm.put("创业与求职", "JobAndWork");
		hm.put("就业特快", "JobExpress");
		hm.put("笑话版", "Joke");
		hm.put("新闻传播研究", "Journalism");
		hm.put("江苏体育", "JSSports");
		hm.put("考研天地", "KaoYan");
		hm.put("卡拉永远OK", "KaraOK");
		hm.put("恋恋韩风", "Korea");
		hm.put("法律学", "Law");
		hm.put("学术交流", "LectureHall");
		hm.put("花果山下", "LianYunGang");
		hm.put("生活", "Life");
		hm.put("生命协会", "LifeLeague");
		hm.put("生命科学", "LifeScience");
		hm.put("百合精华", "LilyDigest");
		hm.put("百合站庆", "LilyFestival");
		hm.put("百合友情链接", "LilyLinks");
		hm.put("小百合工作室项目反馈", "LilyStudio");
		hm.put("语言与语言学", "Linguistics");
		hm.put("Linux和Unix", "LinuxUnix");
		hm.put("失物招领", "LostToFind");
		hm.put("情爱悠悠", "Love");
		hm.put("物流与供应链管理协会", "LSCMA");
		hm.put("兰州大学", "LZU");
		hm.put("教务处处长信箱", "M_Academic");
		hm.put("心理中心主任信箱", "M_CMHER");
		hm.put("工会主席信箱版", "M_Gonghui");
		hm.put("研究生院院长信箱", "M_Graduate");
		hm.put("研究生会主席信箱", "M_GraduateUnion");
		hm.put("保卫处处长信箱", "M_Guard");
		hm.put("校医院院长信箱", "M_Hospital");
		hm.put("就业创业指导中心主任信箱", "M_Job");
		hm.put("团委书记信箱", "M_League");
		hm.put("图书馆馆长信箱", "M_Library");
		hm.put("后勤工作信箱", "M_Logistic");
		hm.put("网络中心主任信箱", "M_NIC");
		hm.put("学生工作处处长信箱", "M_Student");
		hm.put("学生会主席信箱", "M_StudentUnion");
		hm.put("魔术", "Magic");
		hm.put("麻将", "MaJiang");
		hm.put("管理学", "Management");
		hm.put("模式动物研究所", "MARC");
		hm.put("营销学社", "Marketing_Zone");
		hm.put("鬼故事", "Marvel");
		hm.put("数学版", "Mathematics");
		hm.put("数学工具软件", "MathTools");
		hm.put("媒介文化研究", "Mediastudy");
		hm.put("医学与健康", "Medicine");
		hm.put("似水流年", "Memory");
		hm.put("电磁场与微波技术", "Microwave");
		hm.put("军事科学", "Military");
		hm.put("手机天地", "Mobile");
		hm.put("模型空间", "Model_Space");
		hm.put("现代诗歌", "Modern_Poem");
		hm.put("露天电影院", "Movies");
		hm.put("微软技术俱乐部", "MSTClub");
		hm.put("美丽的微软窗口", "MSWindows");
		hm.put("MUD人生", "MudLife");
		hm.put("音乐剧之家", "Musical");
		hm.put("神话传说", "Mythlegend");
		hm.put("姓名文化", "Names");
		hm.put("古都南京", "NanJing");
		hm.put("纳米科技", "NanoST");
		hm.put("江风海韵", "NanTong");
		hm.put("人与自然", "Nature");
		hm.put("网络资源", "NetResources");
		hm.put("网络世界", "Network");
		hm.put("新世纪音乐", "NewAge");
		hm.put("新手上路", "newcomers");
		hm.put("桫椤双树园", "Nirvana");
		hm.put("房屋租赁", "NJ_HOUSE");
		hm.put("南京农业大学", "NJAU");
		hm.put("南京医科大学", "NJMU");
		hm.put("南京师范大学", "NJNU");
		hm.put("南大研究生报", "NJU_Graduate");
		hm.put("南大和园", "NJU_HOME");
		hm.put("南京大学腾讯创新俱乐部", "NJU_TIC");
		hm.put("南大青年报", "NJU_Youth");
		hm.put("南京大学知行社", "NJU_zhixing");
		hm.put("南大校园生活", "NJUExpress");
		hm.put("模拟联合国协会", "NJUMUN");
		hm.put("南京邮电大学", "NJUPT");
		hm.put("南京工业大学", "NJUT");
		hm.put("南开大学", "NKU");
		hm.put("本本梦工厂", "NoteBook");
		hm.put("酸甜苦辣留言版", "notepad");
		hm.put("小说", "Novel");
		hm.put("南京航空航天大学", "NUAA");
		hm.put("南京理工大学", "NUST");
		hm.put("南京中医药大学", "NZY");
		hm.put("上班一族", "OfficeStaff");
		hm.put("网络游戏", "OLGames");
		hm.put("奥林匹克运动", "Olympics");
		hm.put("南大交响乐团", "Orchestra");
		hm.put("中国海洋大学", "OUC");
		hm.put("民俗民风", "OurCustom");
		hm.put("百合原创", "Ourselves");
		hm.put("海外游子", "Overseas");
		hm.put("涂鸦论坛", "Paint");
		hm.put("兼职工作信息", "PartTimeJob");
		hm.put("杀手的童话", "Party_of_Killer");
		hm.put("电脑游戏", "PCGames");
		hm.put("青春伊甸园", "Peer_Edu");
		hm.put("朋辈咨询", "PeerCounseling");
		hm.put("人物", "People");
		hm.put("个人文集", "PersonalCorpus");
		hm.put("宠物乐园", "PetsEden");
		hm.put("哲学与思考", "Philosophy");
		hm.put("摄影艺术", "Photography");
		hm.put("物理学", "Physics");
		hm.put("钢琴艺术", "Piano");
		hm.put("贴图版", "Pictures");
		hm.put("北京大学", "PKU");
		hm.put("政治科学", "Politics");
		hm.put("流行音乐天地", "PopMusic");
		hm.put("博士后之家", "Postdoc");
		hm.put("程序员的休闲室", "Program");
		hm.put("心理健康", "Psychology");
		hm.put("浦园风景线", "PuKouCampus");
		hm.put("Python语言", "Python");
		hm.put("曲苑杂谈", "QuYi");
		hm.put("空中梦想家", "Radio");
		hm.put("读书", "Reading");
		hm.put("阳光工作室", "ReadyForJob");
		hm.put("房地产", "RealEstate");
		hm.put("红十字运动", "RedCross");
		hm.put("五子连珠", "Renju");
		hm.put("射一射老虎", "Riddle");
		hm.put("摇滚乐世界", "RockMusic");
		hm.put("寝室夜话", "RoomChating");
		hm.put("田径", "RunForEver");
		hm.put("风雪俄罗斯", "Russia");
		hm.put("天文与空间科学学院", "S_Astronomy");
		hm.put("大气科学学院", "S_Atmosphere");
		hm.put("商学院", "S_Business");
		hm.put("化学化工学院", "S_Chemistry");
		hm.put("教育研究院", "S_Education");
		hm.put("环境学院", "S_Environment");
		hm.put("外国语学院", "S_ForeignLang");
		hm.put("地理学院", "S_Geography");
		hm.put("政府管理学院", "S_GOV");
		hm.put("研究生之家", "S_Graduate");
		hm.put("信息管理学院", "S_Information");
		hm.put("新闻传播学院", "S_Journalism");
		hm.put("法学院", "S_Law");
		hm.put("生命科学院", "S_LifeScience");
		hm.put("医学院", "S_Medicine");
		hm.put("工程管理学院", "S_MSE");
		hm.put("社会学院", "S_Sociology");
		hm.put("软件学院", "S_Software");
		hm.put("三国风云", "SanGuo");
		hm.put("建筑与城市规划学院", "SAU");
		hm.put("学生职业发展协会", "SCDA");
		hm.put("雕塑艺术", "Sculpture");
		hm.put("阳光海岸（华南网友版）", "SE_Association");
		hm.put("欧美电视剧", "Seasons");
		hm.put("东南大学", "SEU");
		hm.put("齐鲁青未了", "ShanDong");
		hm.put("寻梦海上花", "ShangHai");
		hm.put("三晋梦萦", "ShanXi");
		hm.put("购物天堂", "Shopping");
		hm.put("短信大家聊", "ShortMessage");
		hm.put("综艺大秀场", "Shows");
		hm.put("国际大学生企业家联盟", "SIFE_NJU");
		hm.put("缥缈四国", "SiGuo");
		hm.put("单身一族", "Single");
		hm.put("南大思源社", "SiYuan");
		hm.put("升级艺术", "SJ");
		hm.put("上海交通大学", "SJTU");
		hm.put("溜冰人生", "Skating");
		hm.put("淡烟人生", "Smoking");
		hm.put("软件工程", "SoftEng");
		hm.put("软件天地", "Software");
		hm.put("南大学生心理协会", "SPA");
		hm.put("西班牙语", "Spanish");
		hm.put("体坛快讯", "SportsNews");
		hm.put("视觉南大", "StaffPhotography");
		hm.put("股市风云", "Stock");
		hm.put("石头城", "StoneCity");
		hm.put("红楼逸梦", "StoneStory");
		hm.put("故事会", "Story");
		hm.put("快乐数独", "Sudoku");
		hm.put("超级女声", "SuperGirls");
		hm.put("西楚下相", "SuQian");
		hm.put("雨渍东吴", "SuZhou");
		hm.put("游泳", "Swimming");
		hm.put("站长的工作室", "sysop");
		hm.put("乒乓球", "TableTennis");
		hm.put("跆拳道", "Taekwondo");
		hm.put("宝岛之恋", "Taiwan");
		hm.put("古韵泰州", "TaiZhou");
		hm.put("古意中医", "TCM");
		hm.put("网球天地", "Tennis");
		hm.put("这是站内测试版", "test");
		hm.put("科技文献排版", "TeX");
		hm.put("理论计算机科学", "Theoretical_CS");
		hm.put("论文", "Thesis");
		hm.put("清华大学", "THU");
		hm.put("南大天健社", "TianJian");
		hm.put("九河下梢天津卫", "TianJin");
		hm.put("雪域桑烟", "Tibet");
		hm.put("交通信息", "Traffic_Info");
		hm.put("汽笛声声", "Train");
		hm.put("遍览天下", "Travel");
		hm.put("电视", "TV");
		hm.put("电视游戏", "TVGames");
		hm.put("城市规划", "UrbanPlan");
		hm.put("美日研究", "US_JP_Research");
		hm.put("中国科技大学", "USTC");
		hm.put("校长信箱", "V_Suggestions");
		hm.put("Visual C++ 版", "VC");
		hm.put("素食者", "Vegetarian");
		hm.put("可恶可怕的病毒", "Virus");
		hm.put("排球版", "Volleyball");
		hm.put("青年志愿者协会", "Volunteer");
		hm.put("本站各项投票与结果", "vote");
		hm.put("选举版", "VoteBoard");
		hm.put("百年好合", "WarAndPeace");
		hm.put("网站设计", "WebDesign");
		hm.put("网页游戏", "WebGames");
		hm.put("围棋", "WeiQi");
		hm.put("支教岁月", "West_Volunteer");
		hm.put("国际象棋", "WesternstyleChess");
		hm.put("武汉大学", "WHU");
		hm.put("儒释道", "Wisdom");
		hm.put("世界足球", "WorldFootball");
		hm.put("国际新闻", "WorldNews");
		hm.put("中华武术", "WuShu");
		hm.put("梁溪寄畅", "WuXi");
		hm.put("壮哉大西北", "XiBei");
		hm.put("风起西南", "XiNan");
		hm.put("新鸿基社", "xinhongji");
		hm.put("我们新疆亚克西", "XinJiang");
		hm.put("西安交通大学", "XJTU");
		hm.put("厦门大学", "XMU");
		hm.put("古彭汉风", "XuZhou");
		hm.put("登瀛渔火", "YanCheng");
		hm.put("杨式太极拳协会", "YangTaiChi");
		hm.put("长江三角洲发展论坛", "YangtzeDelta");
		hm.put("五亭烟雨", "YangZhou");
		hm.put("南大瑜伽", "YOGA");
		hm.put("钱江潮", "ZheJiang");
		hm.put("古城镇江", "ZhenJiang");
		hm.put("家居装修", "ZhuangXiu");
		hm.put("珠江路热线", "Zjl_Online");
		hm.put("浙江大学", "ZJU");
		hm.put("中山大学", "ZSU");

		


		return hm;

	}
	
	public static HashMap<String,String> getBBSRightName() {
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("1937_12_13", "1937_12_13");
		hm.put("7th_art", "7th_Art");
		hm.put("abroad", "Abroad");
		hm.put("academicreport", "AcademicReport");
		hm.put("actuary", "Actuary");
		hm.put("ad_art", "AD_Art");
		hm.put("advice", "Advice");
		hm.put("aerospace", "Aerospace");
		hm.put("agent", "Agent");
		hm.put("ai", "AI");
		hm.put("albumshow", "AlbumShow");
		hm.put("algorithm", "Algorithm");
		hm.put("america", "America");
		hm.put("anhui", "AnHui");
		hm.put("announce", "Announce");
		hm.put("antimalfeasant", "AntiMalfeasant");
		hm.put("antirumor", "AntiRumor");
		hm.put("apple", "Apple");
		hm.put("archaism", "Archaism");
		hm.put("archeology", "Archeology");
		hm.put("asciiart", "ASCIIArt");
		hm.put("association_union", "Association_Union");
		hm.put("astrology", "Astrology");
		hm.put("atmospheresci", "AtmosphereSci");
		hm.put("autospeed", "AutoSpeed");
		hm.put("badminton", "Badminton");
		hm.put("basketball", "Basketball");
		hm.put("bbsdev", "BBSDev");
		hm.put("bbshelp", "BBSHelp");
		hm.put("bbslists", "bbslists");
		hm.put("beijing", "BeiJing");
		hm.put("billiards", "Billiards");
		hm.put("bittorrent", "BitTorrent");
		hm.put("bless", "Bless");
		hm.put("blog", "Blog");
		hm.put("bmmanager", "BMManager");
		hm.put("bngames", "BNGames");
		hm.put("board", "Board");
		hm.put("boardgame", "BoardGame");
		hm.put("boardmanage", "BoardManage");
		hm.put("bodilyform", "BodilyForm");
		hm.put("borland", "Borland");
		hm.put("bowling", "Bowling");
		hm.put("boxing_fight", "Boxing_Fight");
		hm.put("boys", "Boys");
		hm.put("bridge", "Bridge");
		hm.put("britain", "Britain");
		hm.put("budaixi", "Budaixi");
		hm.put("bulletin", "bulletin");
		hm.put("c_inter", "C_Inter");
		hm.put("calligraphy", "Calligraphy");
		hm.put("cas", "CAS");
		hm.put("ccas", "CCAS");
		hm.put("ccp", "CCP");
		hm.put("cfd", "CFD");
		hm.put("changzhou", "ChangZhou");
		hm.put("chat", "Chat");
		hm.put("chemistry", "Chemistry");
		hm.put("chess", "Chess");
		hm.put("chinafootball", "ChinaFootball");
		hm.put("chinanews", "ChinaNews");
		hm.put("chorus", "Chorus");
		hm.put("chrematistics", "Chrematistics");
		hm.put("christianity", "Christianity");
		hm.put("chunqiu_zhanguo", "ChunQiu_ZhanGuo");
		hm.put("civil_servant", "Civil_Servant");
		hm.put("classical_poem", "Classical_Poem");
		hm.put("classicalculture", "ClassicalCulture");
		hm.put("classicalmusic", "ClassicalMusic");
		hm.put("collections", "Collections");
		hm.put("comic", "Comic");
		hm.put("complain", "Complain");
		hm.put("computer_abc", "Computer_ABC");
		hm.put("consultant", "Consultant");
		hm.put("contest", "Contest");
		hm.put("couplet", "Couplet");
		hm.put("cpa", "CPA");
		hm.put("cplusplus", "CPlusPlus");
		hm.put("cpu", "CPU");
		hm.put("cross_strait", "Cross_Strait");
		hm.put("crossshow", "CrossShow");
		hm.put("cube", "Cube");
		hm.put("cug", "CUG");
		hm.put("cumt", "CUMT");
		hm.put("cycling", "Cycling");
		hm.put("d_chinese", "D_Chinese");
		hm.put("d_computer", "D_Computer");
		hm.put("d_earthscience", "D_EarthScience");
		hm.put("d_ee", "D_EE");
		hm.put("d_history", "D_History");
		hm.put("d_materials", "D_Materials");
		hm.put("d_maths", "D_Maths");
		hm.put("d_philosophy", "D_Philosophy");
		hm.put("d_physics", "D_Physics");
		hm.put("d_socialsec", "D_SocialSec");
		hm.put("dance", "Dance");
		hm.put("database", "Database");
		hm.put("debate", "Debate");
		hm.put("detective", "Detective");
		hm.put("deutsch", "Deutsch");
		hm.put("digimusic", "DigiMusic");
		hm.put("digitalworld", "DigitalWorld");
		hm.put("dii", "DII");
		hm.put("discovery", "Discovery");
		hm.put("disczone", "DiscZone");
		hm.put("dongbei", "DongBei");
		hm.put("dotaallstars", "DotaAllstars");
		hm.put("dotnet", "DotNet");
		hm.put("drama", "Drama");
		hm.put("drawing", "Drawing");
		hm.put("dream", "Dream");
		hm.put("drink", "Drink");
		hm.put("dv_studio", "DV_Studio");
		hm.put("e_business", "E_Business");
		hm.put("e_sports", "E_Sports");
		hm.put("earthsciences", "EarthSciences");
		hm.put("economics", "Economics");
		hm.put("education", "Education");
		hm.put("eetechnology", "EEtechnology");
		hm.put("electronicmusic", "ElectronicMusic");
		hm.put("embedded", "Embedded");
		hm.put("emprise", "Emprise");
		hm.put("english", "English");
		hm.put("englishcorner", "EnglishCorner");
		hm.put("esperanto", "Esperanto");
		hm.put("esquire", "Esquire");
		hm.put("excellentbm", "ExcellentBM");
		hm.put("exchangestudent", "ExchangeStudent");
		hm.put("f1", "F1");
		hm.put("f_literature", "F_Literature");
		hm.put("fairytale", "FairyTale");
		hm.put("familylife", "FamilyLife");
		hm.put("fanbu", "FanBu");
		hm.put("fantasy", "Fantasy");
		hm.put("fashion", "Fashion");
		hm.put("fdu", "FDU");
		hm.put("fea", "FEA");
		hm.put("feelings", "Feelings");
		hm.put("fiction", "Fiction");
		hm.put("finance", "Finance");
		hm.put("fishing", "Fishing");
		hm.put("fitness", "Fitness");
		hm.put("flash", "Flash");
		hm.put("fleamarket", "FleaMarket");
		hm.put("flowers", "Flowers");
		hm.put("folk_country", "Folk_Country");
		hm.put("folk_music", "Folk_Music");
		hm.put("food", "FOOD");
		hm.put("fortran", "Fortran");
		hm.put("forum", "Forum");
		hm.put("french", "French");
		hm.put("friendship", "Friendship");
		hm.put("fujian", "FuJian");
		hm.put("gafa", "GAFA");
		hm.put("gec", "GEC");
		hm.put("geography", "Geography");
		hm.put("girls", "Girls");
		hm.put("gis", "GIS");
		hm.put("gj", "GJ");
		hm.put("gotouniversity", "GoToUniversity");
		hm.put("graphics", "Graphics");
		hm.put("gre_toefl", "GRE_TOEFL");
		hm.put("greatturn", "GreatTurn");
		hm.put("greecerome", "GreeceRome");
		hm.put("greenearth", "GreenEarth");
		hm.put("guangdong", "GuangDong");
		hm.put("guangxi", "GuangXi");
		hm.put("guilt", "Guilt");
		hm.put("guitar", "Guitar");
		hm.put("guqin", "GuQin");
		hm.put("hacker", "Hacker");
		hm.put("hainan", "HaiNan");
		hm.put("handicraft", "HandiCraft");
		hm.put("hardware", "Hardware");
		hm.put("hebei", "HeBei");
		hm.put("henan", "HeNan");
		hm.put("hhu", "HHU");
		hm.put("hifi", "HiFi");
		hm.put("history", "History");
		hm.put("hku", "HKU");
		hm.put("hometown", "Hometown");
		hm.put("homosky", "HomoSky");
		hm.put("hotzone", "HotZone");
		hm.put("hpc", "HPC");
		hm.put("huaian", "HuaiAn");
		hm.put("hubei", "HuBei");
		hm.put("human", "Human");
		hm.put("hunan", "HuNan");
		hm.put("id", "ID");
		hm.put("ielts", "IELTS");
		hm.put("ifa_is", "IFA_IS");
		hm.put("ifis", "IFIS");
		hm.put("image", "Image");
		hm.put("info_manage", "Info_Manage");
		hm.put("inner_mongolia", "Inner_Mongolia");
		hm.put("intern", "Intern");
		hm.put("ir", "IR");
		hm.put("itclub", "ITClub");
		hm.put("itexam", "ITExam");
		hm.put("j_ent", "J_Ent");
		hm.put("japanese", "Japanese");
		hm.put("java", "Java");
		hm.put("jazz_blues", "Jazz_Blues");
		hm.put("jiangxi", "JiangXi");
		hm.put("jlu", "JLU");
		hm.put("jobandwork", "JobAndWork");
		hm.put("jobexpress", "JobExpress");
		hm.put("joke", "Joke");
		hm.put("journalism", "Journalism");
		hm.put("jssports", "JSSports");
		hm.put("kaoyan", "KaoYan");
		hm.put("karaok", "KaraOK");
		hm.put("korea", "Korea");
		hm.put("law", "Law");
		hm.put("lecturehall", "LectureHall");
		hm.put("lianyungang", "LianYunGang");
		hm.put("life", "Life");
		hm.put("lifeleague", "LifeLeague");
		hm.put("lifescience", "LifeScience");
		hm.put("lilydigest", "LilyDigest");
		hm.put("lilyfestival", "LilyFestival");
		hm.put("lilylinks", "LilyLinks");
		hm.put("lilystudio", "LilyStudio");
		hm.put("linguistics", "Linguistics");
		hm.put("linuxunix", "LinuxUnix");
		hm.put("losttofind", "LostToFind");
		hm.put("love", "Love");
		hm.put("lscma", "LSCMA");
		hm.put("lzu", "LZU");
		hm.put("m_academic", "M_Academic");
		hm.put("m_cmher", "M_CMHER");
		hm.put("m_gonghui", "M_Gonghui");
		hm.put("m_graduate", "M_Graduate");
		hm.put("m_graduateunion", "M_GraduateUnion");
		hm.put("m_guard", "M_Guard");
		hm.put("m_hospital", "M_Hospital");
		hm.put("m_job", "M_Job");
		hm.put("m_league", "M_League");
		hm.put("m_library", "M_Library");
		hm.put("m_logistic", "M_Logistic");
		hm.put("m_nic", "M_NIC");
		hm.put("m_student", "M_Student");
		hm.put("m_studentunion", "M_StudentUnion");
		hm.put("magic", "Magic");
		hm.put("majiang", "MaJiang");
		hm.put("management", "Management");
		hm.put("marc", "MARC");
		hm.put("marketing_zone", "Marketing_Zone");
		hm.put("marvel", "Marvel");
		hm.put("mathematics", "Mathematics");
		hm.put("mathtools", "MathTools");
		hm.put("mediastudy", "Mediastudy");
		hm.put("medicine", "Medicine");
		hm.put("memory", "Memory");
		hm.put("microwave", "Microwave");
		hm.put("military", "Military");
		hm.put("mobile", "Mobile");
		hm.put("model_space", "Model_Space");
		hm.put("modern_poem", "Modern_Poem");
		hm.put("movies", "Movies");
		hm.put("mstclub", "MSTClub");
		hm.put("mswindows", "MSWindows");
		hm.put("mudlife", "MudLife");
		hm.put("musical", "Musical");
		hm.put("mythlegend", "Mythlegend");
		hm.put("names", "Names");
		hm.put("nanjing", "NanJing");
		hm.put("nanost", "NanoST");
		hm.put("nantong", "NanTong");
		hm.put("nature", "Nature");
		hm.put("netresources", "NetResources");
		hm.put("network", "Network");
		hm.put("newage", "NewAge");
		hm.put("newcomers", "newcomers");
		hm.put("nirvana", "Nirvana");
		hm.put("nj_house", "NJ_HOUSE");
		hm.put("njau", "NJAU");
		hm.put("njmu", "NJMU");
		hm.put("njnu", "NJNU");
		hm.put("nju_graduate", "NJU_Graduate");
		hm.put("nju_home", "NJU_HOME");
		hm.put("nju_tic", "NJU_TIC");
		hm.put("nju_youth", "NJU_Youth");
		hm.put("nju_zhixing", "NJU_zhixing");
		hm.put("njuexpress", "NJUExpress");
		hm.put("njumun", "NJUMUN");
		hm.put("njupt", "NJUPT");
		hm.put("njut", "NJUT");
		hm.put("nku", "NKU");
		hm.put("notebook", "NoteBook");
		hm.put("notepad", "notepad");
		hm.put("novel", "Novel");
		hm.put("nuaa", "NUAA");
		hm.put("nust", "NUST");
		hm.put("nzy", "NZY");
		hm.put("officestaff", "OfficeStaff");
		hm.put("olgames", "OLGames");
		hm.put("olympics", "Olympics");
		hm.put("orchestra", "Orchestra");
		hm.put("ouc", "OUC");
		hm.put("ourcustom", "OurCustom");
		hm.put("ourselves", "Ourselves");
		hm.put("overseas", "Overseas");
		hm.put("paint", "Paint");
		hm.put("parttimejob", "PartTimeJob");
		hm.put("party_of_killer", "Party_of_Killer");
		hm.put("pcgames", "PCGames");
		hm.put("peer_edu", "Peer_Edu");
		hm.put("peercounseling", "PeerCounseling");
		hm.put("people", "People");
		hm.put("personalcorpus", "PersonalCorpus");
		hm.put("petseden", "PetsEden");
		hm.put("philosophy", "Philosophy");
		hm.put("photography", "Photography");
		hm.put("physics", "Physics");
		hm.put("piano", "Piano");
		hm.put("pictures", "Pictures");
		hm.put("pku", "PKU");
		hm.put("politics", "Politics");
		hm.put("popmusic", "PopMusic");
		hm.put("postdoc", "Postdoc");
		hm.put("program", "Program");
		hm.put("psychology", "Psychology");
		hm.put("pukoucampus", "PuKouCampus");
		hm.put("python", "Python");
		hm.put("quyi", "QuYi");
		hm.put("radio", "Radio");
		hm.put("reading", "Reading");
		hm.put("readyforjob", "ReadyForJob");
		hm.put("realestate", "RealEstate");
		hm.put("redcross", "RedCross");
		hm.put("renju", "Renju");
		hm.put("riddle", "Riddle");
		hm.put("rockmusic", "RockMusic");
		hm.put("roomchating", "RoomChating");
		hm.put("runforever", "RunForEver");
		hm.put("russia", "Russia");
		hm.put("s_astronomy", "S_Astronomy");
		hm.put("s_atmosphere", "S_Atmosphere");
		hm.put("s_business", "S_Business");
		hm.put("s_chemistry", "S_Chemistry");
		hm.put("s_education", "S_Education");
		hm.put("s_environment", "S_Environment");
		hm.put("s_foreignlang", "S_ForeignLang");
		hm.put("s_geography", "S_Geography");
		hm.put("s_gov", "S_GOV");
		hm.put("s_graduate", "S_Graduate");
		hm.put("s_information", "S_Information");
		hm.put("s_journalism", "S_Journalism");
		hm.put("s_law", "S_Law");
		hm.put("s_lifescience", "S_LifeScience");
		hm.put("s_medicine", "S_Medicine");
		hm.put("s_mse", "S_MSE");
		hm.put("s_sociology", "S_Sociology");
		hm.put("s_software", "S_Software");
		hm.put("sanguo", "SanGuo");
		hm.put("sau", "SAU");
		hm.put("scda", "SCDA");
		hm.put("sculpture", "Sculpture");
		hm.put("se_association", "SE_Association");
		hm.put("seasons", "Seasons");
		hm.put("seu", "SEU");
		hm.put("shandong", "ShanDong");
		hm.put("shanghai", "ShangHai");
		hm.put("shanxi", "ShanXi");
		hm.put("shopping", "Shopping");
		hm.put("shortmessage", "ShortMessage");
		hm.put("shows", "Shows");
		hm.put("sife_nju", "SIFE_NJU");
		hm.put("siguo", "SiGuo");
		hm.put("single", "Single");
		hm.put("siyuan", "SiYuan");
		hm.put("sj", "SJ");
		hm.put("sjtu", "SJTU");
		hm.put("skating", "Skating");
		hm.put("smoking", "Smoking");
		hm.put("softeng", "SoftEng");
		hm.put("software", "Software");
		hm.put("spa", "SPA");
		hm.put("spanish", "Spanish");
		hm.put("sportsnews", "SportsNews");
		hm.put("staffphotography", "StaffPhotography");
		hm.put("stock", "Stock");
		hm.put("stonecity", "StoneCity");
		hm.put("stonestory", "StoneStory");
		hm.put("story", "Story");
		hm.put("sudoku", "Sudoku");
		hm.put("supergirls", "SuperGirls");
		hm.put("suqian", "SuQian");
		hm.put("suzhou", "SuZhou");
		hm.put("swimming", "Swimming");
		hm.put("sysop", "sysop");
		hm.put("tabletennis", "TableTennis");
		hm.put("taekwondo", "Taekwondo");
		hm.put("taiwan", "Taiwan");
		hm.put("taizhou", "TaiZhou");
		hm.put("tcm", "TCM");
		hm.put("tennis", "Tennis");
		hm.put("test", "test");
		hm.put("tex", "TeX");
		hm.put("theoretical_cs", "Theoretical_CS");
		hm.put("thesis", "Thesis");
		hm.put("thu", "THU");
		hm.put("tianjian", "TianJian");
		hm.put("tianjin", "TianJin");
		hm.put("tibet", "Tibet");
		hm.put("traffic_info", "Traffic_Info");
		hm.put("train", "Train");
		hm.put("travel", "Travel");
		hm.put("tv", "TV");
		hm.put("tvgames", "TVGames");
		hm.put("urbanplan", "UrbanPlan");
		hm.put("us_jp_research", "US_JP_Research");
		hm.put("ustc", "USTC");
		hm.put("v_suggestions", "V_Suggestions");
		hm.put("vc", "VC");
		hm.put("vegetarian", "Vegetarian");
		hm.put("virus", "Virus");
		hm.put("volleyball", "Volleyball");
		hm.put("volunteer", "Volunteer");
		hm.put("vote", "vote");
		hm.put("voteboard", "VoteBoard");
		hm.put("warandpeace", "WarAndPeace");
		hm.put("webdesign", "WebDesign");
		hm.put("webgames", "WebGames");
		hm.put("weiqi", "WeiQi");
		hm.put("west_volunteer", "West_Volunteer");
		hm.put("westernstylechess", "WesternstyleChess");
		hm.put("whu", "WHU");
		hm.put("wisdom", "Wisdom");
		hm.put("worldfootball", "WorldFootball");
		hm.put("worldnews", "WorldNews");
		hm.put("wushu", "WuShu");
		hm.put("wuxi", "WuXi");
		hm.put("xibei", "XiBei");
		hm.put("xinan", "XiNan");
		hm.put("xinhongji", "xinhongji");
		hm.put("xinjiang", "XinJiang");
		hm.put("xjtu", "XJTU");
		hm.put("xmu", "XMU");
		hm.put("xuzhou", "XuZhou");
		hm.put("yancheng", "YanCheng");
		hm.put("yangtaichi", "YangTaiChi");
		hm.put("yangtzedelta", "YangtzeDelta");
		hm.put("yangzhou", "YangZhou");
		hm.put("yoga", "YOGA");
		hm.put("zhejiang", "ZheJiang");
		hm.put("zhenjiang", "ZhenJiang");
		hm.put("zhuangxiu", "ZhuangXiu");
		hm.put("zjl_online", "Zjl_Online");
		hm.put("zju", "ZJU");
		hm.put("zsu", "ZSU");
		
		return hm;
	}
	
	
}
