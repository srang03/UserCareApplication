# UserCareApplication
2019-2 Software Development Practice3

■ 배경 및 목표

2018년 기준 우리나라 비만 인구 비율이 경제협력개발기구(OECD) 국가 중에서는 최하위권이라는 분석이 나왔고 지난 10년간 꾸준히 증가하고 있는 것으로 조사되었다. 비만 인구 비율이 증가하는 이유로는 신체활동이 줄고 고열량, 고지방 음식 섭취율의 증가와 아침 결식 및 잦은 회식 등 부적절한 식습관 등이 영향을 끼쳤다는 분석이 나온다. 이러한 이유로 비만으로 인하여 질병 위험과 사망 위험률이 높아지는 상황이 발생하고 있어서 사람들의 체중관리가 필요한 상황이다.



![image](https://user-images.githubusercontent.com/53038387/82637089-03de6280-9c3f-11ea-94c8-ccf92de94eee.png)



과체중 및 비만은 고혈압, 심장 질환 및 당뇨병과 같은 질병의 위험 요소이므로 이상적인 체중을 찾기 위해서 신체 상태를 확인해야 한다. BMI 지수를 측정하게 되면 자신의 비만도와 신체적인 건강상태를 최소한으로 알 수 있고 체중 감량이나 다이어트를 원하는 사용자에게 체중 개선을 할 수 있도록 도움을 준다. 꾸준한 BMI 지수 체크와 올바른 생활습관을 만들어 간다면 비만으로부터 건강한 삶을 지킬 수 있다.





■ 과제 수행내용

1) 사용자의 키와 몸무게 입력

2) 사용자 몸무게 DB 저장 및 그래프 제공

3) BMI 계산기를 통해 체질량 지수를 계산하고 평가
➀ 비만도 측정(BMI)을 통해 비만도 지수 정보제공
➁ 신체와 체중을 쉽게 관리하기 위해 체질과 체중 변화의 상세한 분석을 제공

4) WHR 계산기를 통해 허리와 엉덩이 사이즈 비교 하여 비만도 지수를 계산하고 평가
➀ 비만도 측정(WHR)을 통해 비만도 지수 정보 제공
➁ 신체와 체중을 쉽게 관리하기 위해 체질과 체중 변화의 상세한 분석을 제공

5) 운동 정보제공
➀ 칼로리별 운동 정보 제공
➁ 운동 알림 기능

* 성능 요구사항
![image](https://user-images.githubusercontent.com/53038387/82637189-37b98800-9c3f-11ea-8504-d2475b6d04fc.png)





■ 수행결과 및 결과물

1) Application Development State

![image](https://user-images.githubusercontent.com/53038387/82637922-c7136b00-9c40-11ea-8fcc-2023a0650277.png)


2) Application Dataflow and Function

![image](https://user-images.githubusercontent.com/53038387/82637957-d4305a00-9c40-11ea-8767-735e1ea17f0a.png)



➀ IntroActivity
   애플리케이션 실행 시 Intro Animation이 실행됩니다.

➁ Navigation Drawer
- Home Fragment : 홈 화면으로 사용자의 몸무게 수치를 입력할 수 있고 해당 데이터가 FireBase Date Base에 저장됩니다. 저장된 데이터를 토대로 화면에 그래프가 그려져 사용자가 한눈에 체중 변화를 확인할 수 있습니다.
사용기술 : Firebase Database

![image](https://user-images.githubusercontent.com/53038387/82637729-608e4d00-9c40-11ea-8dc6-2a9078eb9ddc.png)



 - BMI Check Fragment : Application Range Bar를 이용하여 사용자의 몸무게와 키 정보를 입력하게 되면 그 값에 따라 자신의 BMI 정보를 알 수 있고 해당 수치에 따라 색상이 변화되어 본인이 비만 인지 여부에 대해서 알 수 있습니다.


-  WHR Check Fragment : Application에 자신의 나이와 몸무게, 키를 입력하게 되면 WHR 계산기를 통해 허리와 엉덩이 사이즈 비교 하여 비만도 지수를 계산하고 평가할 수 있습니다.


- Exercise Information View : Recycle View와 menu list를 이용하여 사용자에게 운동 정보를 제공합니다. 운동 정보로 운동명칭, 1시간 동안 사용되는 칼로리양 그리고 운동 가이드를 제시합니다.


➂ Notification 알림 기능 : FireBase의 Messaging기능을 이용하여 사용자에게 실시간으로 운동 정보 및 운동 여부를 알려줍니다. 
* 사용기술 : Firebase FCM 기능

![image](https://user-images.githubusercontent.com/53038387/82637672-3d639d80-9c40-11ea-92ae-30e9eeddeb9c.png)




■ 기대효과 및 활용 방안

1) BMI 지수 측정 및 평가
➀ BMI 지수와 입력된 신체정보를 비교하여 자신의 위치를 제공 
➁ 체중관리가 필요할 경우 운동 정보 제공

2) 체중 관리
➀ 사용자의 체중 변화 분석을 통해 체중 관리의 방향 설정 가능
➁ 목표 체중에 도달하기 위해 목표체중 설정 및 상기 기능 제공
