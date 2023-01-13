package com.hfad.lab_2movies.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.fragment.app.DialogFragment
import com.hfad.lab_2movies.R
import com.hfad.lab_2movies.model.Movie

class AddMovieDialogFragment:DialogFragment() {

    interface AddMovieDialogListener {
        fun onDialogPositiveClick(title:String,description:String,producer:String,actors:String)
        fun onDialogNegativeClick(dialog:DialogFragment)
    }

    lateinit var listener: AddMovieDialogListener

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let{
            val builder = AlertDialog.Builder(it)
            val inflater = requireActivity().layoutInflater
            val view: View = inflater.inflate(R.layout.dialog_add_movie,null)

            val newMovieTitleEditText:EditText = view.findViewById(R.id.newMovieTitleEditText)
            val newMovieDescriptionEditText:EditText = view.findViewById(R.id.newMovieDescriptionEditText)
            val newMovieProducerEditText:EditText = view.findViewById(R.id.newMovieProducerEditText)
            val newMovieActorsEditText:EditText=view.findViewById(R.id.newMovieActorsEditText)

            builder.setView(view)
                .setPositiveButton(R.string.ok,
                                    DialogInterface.OnClickListener{dialog, id ->
                                        listener.onDialogPositiveClick(newMovieTitleEditText.text.toString(),
                                                                        newMovieDescriptionEditText.text.toString(),
                                                                        newMovieProducerEditText.text.toString(),
                                                                        newMovieActorsEditText.text.toString())
                                    })
                .setNegativeButton(R.string.cancel,DialogInterface.OnClickListener{dialog, id -> listener.onDialogNegativeClick(this)})
            builder.create()

        }?: throw IllegalStateException("Activity can not be null")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try{
            listener= context as AddMovieDialogListener
        }catch (e:ClassCastException){
            throw ClassCastException("${context.toString()} must implement AddMovieDialogListener")
        }
    }
}