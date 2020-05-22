# Check Your BMI

### 프로젝트 개요


체중변화에 관심을 가지고 꾸준한 BMI 지수 체크와 올바른 생활습관을 만들어 간다면 비만으로부터 건강한 삶을 지킬 수 있도록 도와주는 것이 목적이다.


### 프로젝스 수행내용


  1. 사용자의 키와 몸무게 입력
  2. 사용자 몸무게 Firebase Database 저장 및 그래프 제공
  3. BMI 계산기를 통해 체질량 지수를 계산하고 평가
      1. 비만도 측정(BMI)을 통해 비만도 지수 정보제공
      2. 신체와 체중을 쉽게 관리하기 위해 체질과 체중 변화의 상세한 분석을 제공
  4. WHR 계산기를 통해 허리와 엉덩이 사이즈를 비교하여 비만도 지수를 계산하고 평가
      1. 비만도 측정(WHR)을 통해 비만도 지수 정보 제공
      2. 신체와 체중을 쉽게 관리하기 위해 체질과 체중 변화의 상세한 분석을 제공
  5. 운동 정보 제공
      1. 칼로리별 운동 정보 제공
      2. 운동 알림 기능




### 성능 요구사항


| 요구사항 번호 | 요구사항 이름 | 요구사항 내용 | 중요도 |
|:---:|:---:|:---:|:---:|
| PR-1 | BMI 지수 | BMI를 제공하여 본인의 체중과 비교할 수 있게 함 | ★★★★★ |
| PR-2 | 사용자 데이터 저장 | 사용자의 몸무게를 DB에 저장하고 그래프를 제공 함 | ★★★★☆ |
| PR-3 | 사용자 신체정보 입력 | 체중과 키 정보를 간단하게 입력할 수 있도록 함 | ★★★★☆ |
| PR-4 | 어플 UI 편의성 | 다양한 연령대 이용자들이 쉽게 접근할 수 있도록 UI를 디자인 | ★★★☆☆ |






### 프로젝트 수행 결과


  1. Appication Development State
  
  
| Category | Setting Result |
|:---:|:---:|
| Application Name | Checking your BMI |
| Target Device | Android Mobile Phone |
| Minimum SDK | API Level 18 |
| Database | FireBase | 
| Notification | FireBase Cloud Messaging |
| Main Activity | Navigation Drawer |
  
  
  2. Application DataFlow
  
  
  | Data Flow |
  |:---:|
  | ![image](https://user-images.githubusercontent.com/53038387/82642669-3db46680-9c49-11ea-9081-976a3204e2e8.png) |
  

   1. IntroActivity 
  애플리케이션 실행 시 Intro Animation이 실행됩니다.
  ➁ Navigation Drawer
  * Home Fragment : 홈 화면으로 사용자의 몸무게 수치를 입력할 수 있고 해당 데이터가 FireBase Date Base에 저장됩니다. 저장된 데이터를 토대로 화면에 그래프가 그려져 사용자가 한눈에 체중 변화를 확인할 수 있습니다.
  
  
  * BMI Check Fragment : Application Range Bar를 이용하여 사용자의 몸무게와 키 정보를 입력하게 되면 그 값에 따라 자신의 BMI 정보를 알 수 있고 해당 수치에 따라 색상이 변화되어 본인이 비만 인지 여부에 대해서 알 수 있습니다
  
  
  *  WHR Check Fragment : Application에 자신의 나이와 몸무게, 키를 입력하게 되면 WHR 계산기를 통해 허리와 엉덩이 사이즈 비교 하여 비만도 지수를 계산하고 평가할 수 있습니다.
  
  
  * Exercise Information View : Recycle View와 menu list를 이용하여 사용자에게 운동 정보를 제공합니다. 운동 정보로 운동명칭, 1시간 동안 사용되는 칼로리양 그리고 운동 가이드를 제시합니다.
  
  
  





