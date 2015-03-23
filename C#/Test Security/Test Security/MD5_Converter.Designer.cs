namespace Test_Security
{
    partial class MD5_Converter
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.src_lbl = new System.Windows.Forms.Label();
            this.txt_tb = new System.Windows.Forms.TextBox();
            this.dest_lbl = new System.Windows.Forms.Label();
            this.cnvtxt_tb = new System.Windows.Forms.TextBox();
            this.cnvt_btn = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // src_lbl
            // 
            this.src_lbl.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.src_lbl.Location = new System.Drawing.Point(12, 18);
            this.src_lbl.Name = "src_lbl";
            this.src_lbl.Size = new System.Drawing.Size(274, 34);
            this.src_lbl.TabIndex = 0;
            this.src_lbl.Text = "Text to be converted to MD5";
            // 
            // txt_tb
            // 
            this.txt_tb.Location = new System.Drawing.Point(17, 55);
            this.txt_tb.Multiline = true;
            this.txt_tb.Name = "txt_tb";
            this.txt_tb.Size = new System.Drawing.Size(435, 98);
            this.txt_tb.TabIndex = 1;
            // 
            // dest_lbl
            // 
            this.dest_lbl.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.dest_lbl.Location = new System.Drawing.Point(12, 164);
            this.dest_lbl.Name = "dest_lbl";
            this.dest_lbl.Size = new System.Drawing.Size(147, 34);
            this.dest_lbl.TabIndex = 3;
            this.dest_lbl.Text = "Converted Text";
            // 
            // cnvtxt_tb
            // 
            this.cnvtxt_tb.Location = new System.Drawing.Point(12, 215);
            this.cnvtxt_tb.Multiline = true;
            this.cnvtxt_tb.Name = "cnvtxt_tb";
            this.cnvtxt_tb.Size = new System.Drawing.Size(435, 98);
            this.cnvtxt_tb.TabIndex = 4;
            // 
            // cnvt_btn
            // 
            this.cnvt_btn.Font = new System.Drawing.Font("Miramonte", 14F);
            this.cnvt_btn.Location = new System.Drawing.Point(550, 164);
            this.cnvt_btn.Name = "cnvt_btn";
            this.cnvt_btn.Size = new System.Drawing.Size(113, 49);
            this.cnvt_btn.TabIndex = 5;
            this.cnvt_btn.Text = "Convert";
            this.cnvt_btn.UseVisualStyleBackColor = true;
            this.cnvt_btn.Click += new System.EventHandler(this.cnvt_btn_Click);
            // 
            // MD5_Converter
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(773, 434);
            this.Controls.Add(this.cnvt_btn);
            this.Controls.Add(this.cnvtxt_tb);
            this.Controls.Add(this.dest_lbl);
            this.Controls.Add(this.txt_tb);
            this.Controls.Add(this.src_lbl);
            this.Name = "MD5_Converter";
            this.Text = "Security - MD5";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label src_lbl;
        private System.Windows.Forms.TextBox txt_tb;
        private System.Windows.Forms.Label dest_lbl;
        private System.Windows.Forms.TextBox cnvtxt_tb;
        private System.Windows.Forms.Button cnvt_btn;
    }
}

