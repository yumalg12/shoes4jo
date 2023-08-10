package com.multi.shoes4jo.vo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookmarkC {
<<<<<<< HEAD
	private int bookmark_id;
	private String member_id;
	private String start_date;
	private String end_date;
	private String time_unit;
	private String category;
	private String category_name;
	private String category_param;
	private String device;
	private String gender;
	private String ages;
	private String add_date;
=======
	private int BookMarkID;
	private String MemberID;
	private String StartDate;
	private String EndDate;
	private String TimeUnit;
	private String Category;
	private String CategoryName;
	private String CategoryParam;
	private String Device;
	private String Gender;
	private String Ages;
	private String AddDate;
>>>>>>> 92d651ae45846ea42a9f4420d8d0f7ae6df88132
}



<<<<<<< HEAD
     /* @Component 어노테이션은 스프링 프레임워크에서 사용되며, 클래스를 스프링 빈으로 등록하고, 빈의 이름을 지정하는 역할
     *(빈 이름은 다른 빈들이 해당 컴포넌트에 의존성 주입을 요청할 때 사용)
     *
	 * @Data: 클래스에 이 어노테이션을 사용하면 자동으로 getter,setter,toString(), equals() 및 hashCode() 메서드 생성
	 * 
	 * @NoArgsConstructor: 인자가 없는 기본 생성자를 자동으로 생성
	 * 
	 * @AllArgsConstructor: 모든 필드 값을 인자로 갖는 생성자를 자동으로 생성. 클래스의 모든 멤버 변수를 초기화
=======
     /* @Component �뼱�끂�뀒�씠�뀡��� �뒪�봽留� �봽�젅�엫�썙�겕�뿉�꽌 �궗�슜�릺硫�, �겢�옒�뒪瑜� �뒪�봽留� 鍮덉쑝濡� �벑濡앺븯怨�, 鍮덉쓽 �씠由꾩쓣 吏��젙�븯�뒗 �뿭�븷
     *(鍮� �씠由꾩�� �떎瑜� 鍮덈뱾�씠 �빐�떦 而댄룷�꼳�듃�뿉 �쓽議댁꽦 二쇱엯�쓣 �슂泥��븷 �븣 �궗�슜)
     *
	 * @Data: �겢�옒�뒪�뿉 �씠 �뼱�끂�뀒�씠�뀡�쓣 �궗�슜�븯硫� �옄�룞�쑝濡� getter,setter,toString(), equals() 諛� hashCode() 硫붿꽌�뱶 �깮�꽦
	 * 
	 * @NoArgsConstructor: �씤�옄媛� �뾾�뒗 湲곕낯 �깮�꽦�옄瑜� �옄�룞�쑝濡� �깮�꽦
	 * 
	 * @AllArgsConstructor: 紐⑤뱺 �븘�뱶 媛믪쓣 �씤�옄濡� 媛뽯뒗 �깮�꽦�옄瑜� �옄�룞�쑝濡� �깮�꽦. �겢�옒�뒪�쓽 紐⑤뱺 硫ㅻ쾭 蹂��닔瑜� 珥덇린�솕
>>>>>>> 92d651ae45846ea42a9f4420d8d0f7ae6df88132
	 */