# 1. react 생성
npx create-react-app board-front --template typescript

# 2.위 방식으로 생성 안될경우 밑에를 입력 후 다시 위에 명령어를 입력
npm -g i npm 

# 3. react src 삭제할 목록
app.tsx 에서

import logo from './logo.svg';

<div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.tsx</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>

이것들을 지운다 그리고 

function App() {
return (  
<> </>
);
}

이렇게 빈 걸 넣어준다


index.tsx 에서 지워야 할거 

import reportWebVitals from './reportWebVitals';


// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

이것들을 지운다


App.test.tsx,
logo.svg,
reportWebVitals.ts,
setupTests.ts
이것들을 지운다 

# 4. 프론트 폴더 
apis = 백엔드와 연결
assets = 이미지나 미디어 
components = 공통 컴포넌트 작성
constants = 상수들 넣는다
hooks = hook 함수
layouts = header footer
mocks = 
stores = 상태 관리
types = 각종 타입들 저장
utils = 잡다한 유틸들
views = 뷰(페이지)들 모음