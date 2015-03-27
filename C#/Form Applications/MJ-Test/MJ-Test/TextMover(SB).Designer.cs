namespace MJ_Test
{
    partial class TextMover_SB
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
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(TextMover_SB));
            this.strt_btn = new System.Windows.Forms.Button();
            this.pic_lbl = new System.Windows.Forms.Label();
            this.tmr_sb = new System.Windows.Forms.Timer(this.components);
            this.pic_lbl1 = new System.Windows.Forms.Label();
            this.pic_lbl2 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // strt_btn
            // 
            this.strt_btn.Font = new System.Drawing.Font("Miramonte", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.strt_btn.Location = new System.Drawing.Point(595, 12);
            this.strt_btn.Name = "strt_btn";
            this.strt_btn.Size = new System.Drawing.Size(120, 48);
            this.strt_btn.TabIndex = 0;
            this.strt_btn.Text = "START";
            this.strt_btn.UseVisualStyleBackColor = true;
            this.strt_btn.Click += new System.EventHandler(this.strt_btn_Click);
            // 
            // pic_lbl
            // 
            this.pic_lbl.BackColor = System.Drawing.SystemColors.Control;
            this.pic_lbl.Font = new System.Drawing.Font("Miramonte", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.pic_lbl.ForeColor = System.Drawing.Color.Chartreuse;
            this.pic_lbl.Image = ((System.Drawing.Image)(resources.GetObject("pic_lbl.Image")));
            this.pic_lbl.Location = new System.Drawing.Point(43, 76);
            this.pic_lbl.Name = "pic_lbl";
            this.pic_lbl.Size = new System.Drawing.Size(1274, 617);
            this.pic_lbl.TabIndex = 1;
            this.pic_lbl.TextAlign = System.Drawing.ContentAlignment.TopCenter;
            // 
            // tmr_sb
            // 
            this.tmr_sb.Interval = 300;
            this.tmr_sb.Tick += new System.EventHandler(this.tmr_sb_Tick);
            // 
            // pic_lbl1
            // 
            this.pic_lbl1.AutoSize = true;
            this.pic_lbl1.BackColor = System.Drawing.SystemColors.Window;
            this.pic_lbl1.Font = new System.Drawing.Font("Miramonte", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.pic_lbl1.ForeColor = System.Drawing.Color.Chartreuse;
            this.pic_lbl1.Location = new System.Drawing.Point(44, 357);
            this.pic_lbl1.Name = "pic_lbl1";
            this.pic_lbl1.Size = new System.Drawing.Size(63, 24);
            this.pic_lbl1.TabIndex = 2;
            this.pic_lbl1.Text = "label1";
            // 
            // pic_lbl2
            // 
            this.pic_lbl2.AutoSize = true;
            this.pic_lbl2.Font = new System.Drawing.Font("Miramonte", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.pic_lbl2.ForeColor = System.Drawing.Color.Chartreuse;
            this.pic_lbl2.Location = new System.Drawing.Point(1254, 357);
            this.pic_lbl2.Name = "pic_lbl2";
            this.pic_lbl2.Size = new System.Drawing.Size(63, 24);
            this.pic_lbl2.TabIndex = 3;
            this.pic_lbl2.Text = "label2";
            // 
            // TextMover_SB
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1361, 730);
            this.Controls.Add(this.pic_lbl2);
            this.Controls.Add(this.pic_lbl1);
            this.Controls.Add(this.pic_lbl);
            this.Controls.Add(this.strt_btn);
            this.Name = "TextMover_SB";
            this.Text = "TextMover_SB";
            this.Load += new System.EventHandler(this.TextMover_SB_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button strt_btn;
        private System.Windows.Forms.Label pic_lbl;
        private System.Windows.Forms.Timer tmr_sb;
        private System.Windows.Forms.Label pic_lbl1;
        private System.Windows.Forms.Label pic_lbl2;
    }
}