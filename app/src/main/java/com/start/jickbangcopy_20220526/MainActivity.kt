package com.start.jickbangcopy_20220526

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.start.jickbangcopy_20220526.adapters.RoomAdapter
import com.start.jickbangcopy_20220526.databinding.ActivityMainBinding
import com.start.jickbangcopy_20220526.datas.RoomData

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
//    방데이터를 담아두기 위한 목록 변수
    val mRooms = ArrayList<RoomData>()

//    RoomAdapter를 담기 위한 공감 => 채우는 건 onCreate에서 나중에
    lateinit var mRoomAdapter: RoomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//      방데이터를 담는 변수에 RoomData추가 하기
        mRooms.add(RoomData(8000, "서울시 동대문구", 5, "1번째 방입니다"))
        mRooms.add(RoomData(18000, "서울시 서대문구", 0, "2번째 방입니다"))
        mRooms.add(RoomData(29700, "경기도 고양시", 17, "3번째 방입니다."))
        mRooms.add(RoomData(43000, "서울시 중구", -2, "4번째 방입니다."))
        mRooms.add(RoomData(175300, "서울시 송파구", 20, "5번째 방입니다."))

//        RoomData추가 후 어댑터 만들어 필요한 생성자 대입
        mRoomAdapter = RoomAdapter(this,R.layout.room_list_item, mRooms)
//        메인리스트뷰안에 어댑터에 우리가 만든 어댑터 대입 => 기본화면 나옴
        binding.roomListView.adapter = mRoomAdapter

    }
}