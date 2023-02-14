package com.example.japan_bank

import android.os.Bundle
import android.view.*
import androidx.fragment.app.DialogFragment

class MyCustomDialog: DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        getDialog()!!.getWindow()?.setBackgroundDrawableResource(R.drawable.round_corner);
        return inflater.inflate(R.layout.custom_dialog_fragment, container, false)
    }

    override fun onStart() {
        super.onStart()
        dialog!!.window?.setGravity(Gravity.BOTTOM)
    }

}
